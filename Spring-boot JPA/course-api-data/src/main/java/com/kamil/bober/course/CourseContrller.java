package com.kamil.bober.course;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kamil.bober.topic.Topic;


@RestController
public class CourseContrller {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{coursID}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicID}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicID) {
		course.setTopic(new Topic(topicID,"",""));
		courseService.addCours(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{TopicID}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicID ) {
		course.setTopic(new Topic(topicID,"",""));
		courseService.updateCours(course);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{TopicID}/courses/{id}")
	public void deleteCourse(@PathVariable String id ) {
		courseService.deleteCours(id);
	}

}


























