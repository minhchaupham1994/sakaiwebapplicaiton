package com.advancedprogramming.course;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.advancedprogramming.sakai.authentication.User;

public interface ICourseClassRepository extends CrudRepository<CourseClass, BigDecimal>{
	//CourseClass findByClassId(BigDecimal id);
	@Query("SELECT c FROM CourseClass c WHERE c.id in (SELECT m.id FROM Membership m WHERE m.user = (:user))")
	List<CourseClass> findByUser(@Param("user") User user);
	
	@Query("SELECT c FROM CourseClass c WHERE c.id in (SELECT m.id FROM Membership m WHERE m.user.id = (:userId))")
	List<CourseClass> findByUserId(@Param("userId") String userId);
}
