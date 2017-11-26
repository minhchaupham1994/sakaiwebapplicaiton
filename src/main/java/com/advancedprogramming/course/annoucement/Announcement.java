package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
/***********************************************************************
 * Module:  Announcement.java
 * Author:  ChauPham
 * Purpose: Defines the Class Announcement
 ***********************************************************************/
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.advancedprogramming.course.CourseClass;
import com.advancedprogramming.sakai.authentication.User;

@Entity
public class Announcement {
	@Id
	@Column(name = "ANNOUNCEMENT_ID")
	private BigDecimal id;
	
	private String title;
	
	private String content;
	
	private Date dateCreated;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="announcement")
	private List<AnnouncementAttachment> attachments;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CLASS_ID")
	private CourseClass courseClass;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User author;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public List<AnnouncementAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<AnnouncementAttachment> attachments) {
		this.attachments = attachments;
	}

	public CourseClass getCourseClass() {
		return courseClass;
	}

	public void setCourseClass(CourseClass courseClass) {
		this.courseClass = courseClass;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	
	
}