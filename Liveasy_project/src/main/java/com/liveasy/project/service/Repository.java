package com.liveasy.project.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasy.project.entity.Course;

public interface Repository extends JpaRepository<Course,Long> {
	 
}
