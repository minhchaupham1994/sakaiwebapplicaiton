package com.advancedprogramming.course.discussion;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.sakai.authentication.User;

/***********************************************************************
 * Module: Message.java Author: ChauPham Purpose: Defines the Class Message
 ***********************************************************************/

@Entity
public class Message {
	@Id
	@Column(name = "MESSAGE_ID")
	private BigDecimal id;
	
	private String content;
	
	private Date dateCreated;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DISCUSSION_ID")
	private Discussion discussion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User author;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
}