package com.example.demo.courses;

import java.util.*;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.topic.Topic;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course findCourse(String id) {
		return courseRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
