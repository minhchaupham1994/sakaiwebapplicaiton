package com.advancedprogramming.course.assignment;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.attachment.Attachment;

/***********************************************************************
 * Module: SubmissionAttachment.java Author: ChauPham Purpose: Defines the Class
 * SubmissionAttachment
 ***********************************************************************/

@Entity
public class SubmissionAttachment {
	@Id
	@Column(name = "SUBMISSION_ATTACHMENT_ID")
	private BigDecimal id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SUBMISSION_ID")
	private Submission submission;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ATTACHMENT_ID")
	private Attachment attachment;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Submission getSubmission() {
		return submission;
	}

	public void setSubmission(Submission submission) {
		this.submission = submission;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	
}