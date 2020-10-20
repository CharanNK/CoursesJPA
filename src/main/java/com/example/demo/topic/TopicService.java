package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

import javax.persistence.EntityNotFoundException;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic findTopic(String id) {
		return topicRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public void updateTopic(String id,Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
