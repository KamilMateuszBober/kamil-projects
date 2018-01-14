package com.kamil.bober.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.kamil.bober.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
	}
	
	public Course(String id, String name, String descryption, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = descryption;
		this.topic = new Topic(topicId, "","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescryption() {
		return description;
	}
	public void setDescryption(String descryption) {
		this.description = descryption;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	 
}
