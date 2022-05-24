package com.mikroservicesproject.springbootmicroservices1course.service;

import com.mikroservicesproject.springbootmicroservices1course.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
