package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
import java.util.List;

public interface IAnnouncementService {
	/**
	 * @return all announcement of the current user and current course class
	 */
	List<Announcement> getAllAnnouncements();
	
	Announcement getAnnouncement(BigDecimal id);
}
