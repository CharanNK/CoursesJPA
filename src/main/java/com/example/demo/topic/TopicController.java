package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.*;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(method = RequestMethod.GET,value="/topics")
	public List<Topic> getAllTopics(){
		List<Topic> topics = topicService.getAllTopics();
		return topics;
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.POST,value= "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping("/topics/{id}")
	public Topic findTopic(@PathVariable String id) {
		return topicService.findTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
