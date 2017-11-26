package com.advancedprogramming.course.discussion;

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

import com.advancedprogramming.course.CourseClass;
import com.advancedprogramming.sakai.authentication.User;

@Entity
public class Discussion {
	@Id
	@Column(name = "DISCUSSION_ID")
	private BigDecimal id;
	
	private String topic;
	
	private Date dateCreated;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="discussion")
	private List<Message> messages;
	
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> message) {
		this.messages = messages;
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