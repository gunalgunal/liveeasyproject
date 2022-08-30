package com.liveasy.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liveasy.project.entity.Course;

@Component
public class Dao {
	
	@Autowired
	private Repository repo;
	
	public List<Course> getCourse()
	{
		return repo.findAll();
	}
	 

	
	
	public Optional<Course> getCourseById(long id)
	{
		return repo.findById(id);
	}
	
	public void store(Course course)
	{
		repo.save(course);
	}
	public void update(Course course)
	{
		repo.save(course);
	}
	public void remove(long id)
	{
		Course course=repo.getReferenceById(id);
		repo.delete(course);
	}
	

}
