package com.kamil.bober.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService   {
	
	@Autowired
	public CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> course = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(course::add);
		return course;
	}
	
	public Course getCourse(String id) {
		 return courseRepository.findOne(id);		 
	}

	public void addCours(Course course) {
		courseRepository.save(course);
	}

	public void updateCours(Course course) {
		courseRepository.save(course);
		
	}

	public void deleteCours(String id) {
		courseRepository.delete(id);
	}
	
}



















