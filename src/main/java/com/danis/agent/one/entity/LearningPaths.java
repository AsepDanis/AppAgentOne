package com.danis.agent.one.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "lms_learningpaths")
public class LearningPaths implements Serializable{
	
	/**
	 * Author by: Danis
	 */
	private static final long serialVersionUID = 1699479863463929940L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "id_learningpath")
	private Integer idLearningPath;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category")
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "buildid")
	private Integer buildId;
	
	@Column(name = "id_uiconfiguration")
	private Long idUiConfiguration;
	
	@Column(name = "lastchangeat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangeAt = Date.from(Instant.now());
	
	public LearningPaths() {
		// TODO Auto-generated constructor stub
	}

	public LearningPaths(Integer id, Integer idLearningPath, String name, Category category, String code, Integer buildId,
			Long idUiConfiguration, Date lastChangeAt) {
		super();
		this.id = id;
		this.idLearningPath = idLearningPath;
		this.name = name;
		this.category = category;
		this.code = code;
		this.buildId = buildId;
		this.idUiConfiguration = idUiConfiguration;
		this.lastChangeAt = lastChangeAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdLearningPath() {
		return idLearningPath;
	}

	public void setIdLearningPath(Integer idLearningPath) {
		this.idLearningPath = idLearningPath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public Long getIdUiConfiguration() {
		return idUiConfiguration;
	}

	public void setIdUiConfiguration(Long idUiConfiguration) {
		this.idUiConfiguration = idUiConfiguration;
	}

	public Date getLastChangeAt() {
		return lastChangeAt;
	}

	public void setLastChangeAt(Date lastChangeAt) {
		this.lastChangeAt = lastChangeAt;
	}

	@Override
	public String toString() {
		return "LearningPaths [id=" + id + ", idLearningPath=" + idLearningPath + ", name=" + name + ", category="
				+ category + ", code=" + code + ", buildId=" + buildId + ", idUiConfiguration=" + idUiConfiguration
				+ ", lastChangeAt=" + lastChangeAt + "]";
	}
}
