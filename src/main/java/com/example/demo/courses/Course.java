package com.example.demo.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.demo.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private String courseDescription;
	
	private Topic topic;
	
	public Course() {};
	
	public Course(String courseId, String courseName, String courseDescription, String topicId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		topic = new Topic(topicId,"","");
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
