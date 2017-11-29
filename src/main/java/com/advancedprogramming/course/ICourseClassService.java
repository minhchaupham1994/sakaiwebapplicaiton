package com.advancedprogramming.course;

import java.math.BigDecimal;
import java.util.List;

public interface ICourseClassService {
	List<CourseClass> getCourseClasses(String userId);
	CourseClass getCourseClass(BigDecimal id);
}
