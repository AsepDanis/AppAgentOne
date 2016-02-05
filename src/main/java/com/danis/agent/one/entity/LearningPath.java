package com.danis.agent.one.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "lms_learningpath")
public class LearningPath implements Serializable{

	/**
	 * Author by: Danis
	 */
	private static final long serialVersionUID = 5735056616413758787L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "id_parent")
	private Long idPerent;
	
	@Column(name = "lft")
	private Integer lft;
	
	@Column(name = "rgt")
	private Integer rgt;
	
	@Column(name = "id_content")
	private Long idContent;
	
	@Column(name = "id_learningpaths_sub_learningPath")
	private Long idLearningPathsSubLearningPath;
	
	@Column(name = "id_glossary")
	private Long idGlossary;
	
	@Column(name = "position")
	private Long position;
	
	@Column(name = "buildid")
	private Long buildId;
	
	@Column(name = "category")
	private Integer category;
	
	@Column(name = "id_learningpaths_belonging_to")
	private Long idLearningPathsBelongingTo;
	
	@Column(name = "online")
	private Integer online;
	
	@Column(name = "title")
	private String title;

	@Column(name = "lastchangeat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangeAt = Date.from(Instant.now());
	
	public LearningPath() {
		// TODO Auto-generated constructor stub
	}

	public LearningPath(Long id, String name, Long idPerent, Integer lft, Integer rgt, Long idContent,
			Long idLearningPathsSubLearningPath, Long idGlossary, Long position, Long buildId, Integer category,
			Long idLearningPathsBelongingTo, Integer online, String title, Date lastChangeAt) {
		super();
		this.id = id;
		this.name = name;
		this.idPerent = idPerent;
		this.lft = lft;
		this.rgt = rgt;
		this.idContent = idContent;
		this.idLearningPathsSubLearningPath = idLearningPathsSubLearningPath;
		this.idGlossary = idGlossary;
		this.position = position;
		this.buildId = buildId;
		this.category = category;
		this.idLearningPathsBelongingTo = idLearningPathsBelongingTo;
		this.online = online;
		this.title = title;
		this.lastChangeAt = lastChangeAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdPerent() {
		return idPerent;
	}

	public void setIdPerent(Long idPerent) {
		this.idPerent = idPerent;
	}

	public Integer getLft() {
		return lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRgt() {
		return rgt;
	}

	public void setRgt(Integer rgt) {
		this.rgt = rgt;
	}

	public Long getIdContent() {
		return idContent;
	}

	public void setIdContent(Long idContent) {
		this.idContent = idContent;
	}

	public Long getIdLearningPathsSubLearningPath() {
		return idLearningPathsSubLearningPath;
	}

	public void setIdLearningPathsSubLearningPath(Long idLearningPathsSubLearningPath) {
		this.idLearningPathsSubLearningPath = idLearningPathsSubLearningPath;
	}

	public Long getIdGlossary() {
		return idGlossary;
	}

	public void setIdGlossary(Long idGlossary) {
		this.idGlossary = idGlossary;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getBuildId() {
		return buildId;
	}

	public void setBuildId(Long buildId) {
		this.buildId = buildId;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Long getIdLearningPathsBelongingTo() {
		return idLearningPathsBelongingTo;
	}

	public void setIdLearningPathsBelongingTo(Long idLearningPathsBelongingTo) {
		this.idLearningPathsBelongingTo = idLearningPathsBelongingTo;
	}

	public Integer getOnline() {
		return online;
	}

	public void setOnline(Integer online) {
		this.online = online;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getLastChangeAt() {
		return lastChangeAt;
	}

	public void setLastChangeAt(Date lastChangeAt) {
		this.lastChangeAt = lastChangeAt;
	}

	@Override
	public String toString() {
		return "LearningPaths [id=" + id + ", name=" + name + ", idPerent=" + idPerent + ", lft=" + lft + ", rgt=" + rgt
				+ ", idContent=" + idContent + ", idLearningPathsSubLearningPath=" + idLearningPathsSubLearningPath
				+ ", idGlossary=" + idGlossary + ", position=" + position + ", buildId=" + buildId + ", category="
				+ category + ", idLearningPathsBelongingTo=" + idLearningPathsBelongingTo + ", online=" + online
				+ ", title=" + title + ", lastChangeAt=" + lastChangeAt + "]";
	}

}
