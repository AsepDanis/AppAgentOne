package com.danis.agent.one.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scormurl")
public class ScormURL implements Serializable{
	
	/**
	 * Author by: Danis
	 */
	private static final long serialVersionUID = -6343943792921784636L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "keycode")
	private String keyCode;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "lg")
	private String lg;
	
	@Column(name = "relaylmsapitodomain")
	private String relayLMSAPIToDomain;
	
	@Column(name = "oldcontentid")
	private String oldContentId;
	
	@Column(name = "id_lesson")
	private Long idLesson;
	
	@Column(name = "id_learningpath")
	private Long idLearningPath;
	
	@Column(name = "removedurl")
	private String removedURL;

	public ScormURL() {
		// TODO Auto-generated constructor stub
	}

	public ScormURL(Long id, String keyCode, String url, String lg, String relayLMSAPIToDomain, String oldContentId,
			Long idLesson, Long idLearningPath, String removedURL) {
		super();
		this.id = id;
		this.keyCode = keyCode;
		this.url = url;
		this.lg = lg;
		this.relayLMSAPIToDomain = relayLMSAPIToDomain;
		this.oldContentId = oldContentId;
		this.idLesson = idLesson;
		this.idLearningPath = idLearningPath;
		this.removedURL = removedURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLg() {
		return lg;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}

	public String getRelayLMSAPIToDomain() {
		return relayLMSAPIToDomain;
	}

	public void setRelayLMSAPIToDomain(String relayLMSAPIToDomain) {
		this.relayLMSAPIToDomain = relayLMSAPIToDomain;
	}

	public String getOldContentId() {
		return oldContentId;
	}

	public void setOldContentId(String oldContentId) {
		this.oldContentId = oldContentId;
	}

	public Long getIdLesson() {
		return idLesson;
	}

	public void setIdLesson(Long idLesson) {
		this.idLesson = idLesson;
	}

	public Long getIdLearningPath() {
		return idLearningPath;
	}

	public void setIdLearningPath(Long idLearningPath) {
		this.idLearningPath = idLearningPath;
	}

	public String getRemovedURL() {
		return removedURL;
	}

	public void setRemovedURL(String removedURL) {
		this.removedURL = removedURL;
	}

	@Override
	public String toString() {
		return "ScormURL [id=" + id + ", keyCode=" + keyCode + ", url=" + url + ", lg=" + lg + ", relayLMSAPIToDomain="
				+ relayLMSAPIToDomain + ", oldContentId=" + oldContentId + ", idLesson=" + idLesson
				+ ", idLearningPath=" + idLearningPath + ", removedURL=" + removedURL + "]";
	}
}
