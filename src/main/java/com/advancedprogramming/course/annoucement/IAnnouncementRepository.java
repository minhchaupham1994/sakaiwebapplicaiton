package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.advancedprogramming.course.CourseClass;

public interface IAnnouncementRepository extends CrudRepository<Announcement, BigDecimal> {
	List<Announcement> findByCourseClass(CourseClass courseClass);
	
	@Query("SELECT a FROM Announcement a WHERE a.courseClass in (:courseClasses) ORDER BY a.dateCreated DESC")
	List<Announcement> findByCourseClasses(@Param("courseClasses") List<CourseClass> courseClasses);
}
