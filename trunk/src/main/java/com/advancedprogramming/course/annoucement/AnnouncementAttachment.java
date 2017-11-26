package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.attachment.Attachment;

@Entity
public class AnnouncementAttachment {
	@Id
	@Column(name = "ANNOUNCEMENT_ATTACHMENT_ID")
	private BigDecimal id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ANNOUCEMENT_ID")
	private Announcement announcement;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ATTACHMENT_ID")
	private Attachment attachment;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Announcement getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	
	
}