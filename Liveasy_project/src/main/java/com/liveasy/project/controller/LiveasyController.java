package com.liveasy.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.project.entity.Course;
import com.liveasy.project.service.Dao;

@RestController
public class LiveasyController {
	
	@Autowired
	private Dao dao;
	
	@GetMapping("/course")
	public List<Course> retriveAll()
	{
		return dao.getCourse();
	}
	@GetMapping(path="/course/{id}")
	public Optional<Course> retriveWithId(@PathVariable String id)
	{
		return dao.getCourseById(Long.parseLong(id));
	}
	
	@PostMapping("/course/post")
	public void store(@RequestBody Course course)
	{
		dao.store(course);
	}
	 
	@PutMapping("/course/update")
	public Course courseUpdate(@RequestBody Course course)
	{
		dao.update(course);
		return course;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long id)
	{
		try {
			dao.remove(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
