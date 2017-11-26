package com.advancedprogramming.course.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.attachment.Attachment;

@Entity
public class ResourceAttachment {
	@Id
	@Column(name = "RESOURCE_ATTACHMENT_ID")
	private int id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESOURCE_ID")
	private Resource resource;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ATTACHMENT_ID")
	private Attachment attachment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
}