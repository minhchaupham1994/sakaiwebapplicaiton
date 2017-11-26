package com.advancedprogramming.course.assignment;

import java.math.BigDecimal;
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

import com.advancedprogramming.sakai.authentication.User;

/***********************************************************************
 * Module: Submission.java Author: ChauPham Purpose: Defines the Class
 * Submission
 ***********************************************************************/

@Entity
public class Submission {
	@Id
	@Column(name = "SUBMISSION_ID")
	private BigDecimal id;
	
	private Date dateCreated;
	
	private String content;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="submission")
	private List<SubmissionAttachment> attachments;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ASSIGNMENT_ID")
	private Assignment assignment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User user;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<SubmissionAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<SubmissionAttachment> attachments) {
		this.attachments = attachments;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}