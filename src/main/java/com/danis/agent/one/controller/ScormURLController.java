package com.danis.agent.one.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danis.agent.one.dao.LearningPathsDao;
import com.danis.agent.one.dao.ScormURLDao;
import com.danis.agent.one.entity.LearningPaths;
import com.danis.agent.one.entity.ScormURL;

@Component
public class ScormURLController {

	private final Logger log = LoggerFactory.getLogger(ScormURLController.class);

	private final String pageCodePattern = "^.*?\\SpageCode\\:\"([^\"]+)\"\\S[^$]*$";
	
	private ScormURL scorm;
	
	private Pattern pattern;
	
	private Matcher matcher;
	
	private String pageCode;

	@Autowired
	private ScormURLDao sd;

	@Autowired
	private LearningPathsDao lpd;

	public void getEditData(Long id, String keycode) {
		scorm = sd.findOne(id);
		ScormURL scormList = sd.findBykeyCodeStartingWith(keycode);
		int lessonId = scormList.getIdLesson().intValue();
		LearningPaths lp = lpd.findOne(lessonId);
		executeEditData(lp);
	}

	public String readFile(String path) {
		
		BufferedReader br = null;
		
		pattern = Pattern.compile(pageCodePattern, Pattern.MULTILINE);

		try {

			String currentLine;

			br = new BufferedReader(new FileReader(path));

			while ((currentLine = br.readLine()) != null) {
				matcher = pattern.matcher(currentLine);
				if (matcher.find()) {
					pageCode= matcher.group(1);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return pageCode;
	}

	public void createFileSccriptUpdate(long id, long idlesson, long idLearningPath) {
		try {
			String data = "UPDATE dev_altissia.scormurl SET id_lesson=" + idlesson + ", id_learningpath="
					+ idLearningPath + " WHERE id=" + id + ";\n";

			File file = new File("scriptUpdateScormURL.sql");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file.getName(), true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(data);
			bufferWritter.close();

			log.info(file.getAbsolutePath() + " - Create Or Append File Done.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void executeEditData(LearningPaths lp) {
		log.info("Before scormurl=" + scorm.toString());
		log.info("learningPaths=" + lp.toString());

		scorm.setIdLesson(lp.getId().longValue());
		scorm.setIdLearningPath(lp.getIdLearningPath().longValue());
		scorm = sd.save(scorm);

		log.info("After scormurl=" + scorm.toString());
		createFileSccriptUpdate(scorm.getId(), scorm.getIdLesson(), scorm.getIdLearningPath());

	}

}
