package com.danis.agent.one.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danis.agent.one.entity.ScormURL;

public interface ScormURLDao extends JpaRepository<ScormURL, Long> {
	
	List<ScormURL> findDistinctScormURLByIdLessonOrIdLearningPath(Long idLesson, Long idLearningPath);
	
	ScormURL findBykeyCodeStartingWith(String keycode);
	
}
