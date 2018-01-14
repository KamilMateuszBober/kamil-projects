package com.kamil.bober.lesson;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kamil.bober.course.Course;


@RestController
public class LessonContrller {
	
	@Autowired
	private LessonService lessonService;

	@RequestMapping("/topics/{TopicID}/courses/{id}/lessons")
	public List<Lesson> getAllLessons(@PathVariable String id) {
		return lessonService.getAllLessons(id);
	}
	
	@RequestMapping("/topics/{topicsID}/courses/{courseId}/lesson/{id}")
	public Lesson getLesson(@PathVariable String id) {
		return lessonService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{TopicID}/courses/{CourseId}/lessons/")
	public void updateLesson(@RequestBody Lesson lesson, @PathVariable String id, @PathVariable String courseId ) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.updateLesson(lesson);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{TopicId}/courses/{CourseId}/lessons/{id}")
	public void deleteCourse(@PathVariable String id ) {
		lessonService.deleteLesson(id);
	}

}


























