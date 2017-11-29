package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
import java.util.List;

import com.advancedprogramming.sakai.authentication.User;

public interface IAnnouncementService {
	/**
	 * @return all announcement of the current user and current course class
	 */
	List<Announcement> getAllAnnouncements();
	
	Announcement getAnnouncement(BigDecimal id);
	
	List<Announcement> getRecentAnnouncements(User user, int count);
}
