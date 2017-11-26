package com.advancedprogramming.attachment;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.advancedprogramming.course.annoucement.AnnouncementAttachment;
import com.advancedprogramming.course.assignment.SubmissionAttachment;
import com.advancedprogramming.course.resource.ResourceAttachment;

@Entity
public class Attachment {
	
	@Id
	@Column(name = "ATTACHMENT_ID")
	private BigDecimal id;
	
	private String name;
	
	private String url;
	
	private Date dateCreated;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="attachment")
	private List<SubmissionAttachment> submissions;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="attachment")
	private List<ResourceAttachment> resources;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="attachment")
	private List<AnnouncementAttachment> announcements;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public List<SubmissionAttachment> getSubmissions() {
		return submissions;
	}

	public void setSubmissions(List<SubmissionAttachment> submissions) {
		this.submissions = submissions;
	}

	public List<ResourceAttachment> getResources() {
		return resources;
	}

	public void setResources(List<ResourceAttachment> resources) {
		this.resources = resources;
	}

	public List<AnnouncementAttachment> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<AnnouncementAttachment> announcements) {
		this.announcements = announcements;
	}
}