package com.mindtree.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
//	//this method implementation will automatically return courses by a certain name
//	public List<Course> findByName(String coursename);
	
	public List<Course> findByTopicId(String topicId);

}
