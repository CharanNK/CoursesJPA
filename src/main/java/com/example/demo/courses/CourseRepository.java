package com.example.demo.courses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
	public List<Course> findByCourseName(String name);
}
