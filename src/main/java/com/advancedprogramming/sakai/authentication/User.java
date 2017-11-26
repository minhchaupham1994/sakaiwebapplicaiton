package com.advancedprogramming.sakai.authentication;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.advancedprogramming.course.annoucement.Announcement;
import com.advancedprogramming.course.assignment.Assignment;
import com.advancedprogramming.course.assignment.Submission;
import com.advancedprogramming.course.discussion.Discussion;
import com.advancedprogramming.course.discussion.Message;
import com.advancedprogramming.course.gradebook.Gradebook;

/***********************************************************************
 * Module: User.java Author: ChauPham Purpose: Defines the Class User
 ***********************************************************************/

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@Column(name = "USERS_ID")
	private BigDecimal id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="author")
	private List<Discussion> discussions;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="author")
	private List<Message> messages;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="student")
	private List<Gradebook> gradebooks;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="user")
	private List<Submission> submissions;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="author")
	private List<Assignment> assignments;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="author")
	private List<Announcement> announcements;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="user")
	private List<Membership> memberships;
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Discussion> getDiscussions() {
		return discussions;
	}


	public void setDiscussions(List<Discussion> discussions) {
		this.discussions = discussions;
	}


	public List<Message> getMessages() {
		return messages;
	}


	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}


	public List<Gradebook> getGradebooks() {
		return gradebooks;
	}


	public void setGradebooks(List<Gradebook> gradebooks) {
		this.gradebooks = gradebooks;
	}


	public List<Submission> getSubmissions() {
		return submissions;
	}


	public void setSubmissions(List<Submission> submissions) {
		this.submissions = submissions;
	}


	public List<Assignment> getAssignments() {
		return assignments;
	}


	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}


	public List<Announcement> getAnnouncements() {
		return announcements;
	}


	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}


	public List<Membership> getMemberships() {
		return memberships;
	}


	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}



}