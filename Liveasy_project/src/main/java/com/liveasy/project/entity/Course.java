package com.liveasy.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String description;
	
	public Course()
	{
		
	}
	 
	public Course(long id,String title,String description)
	{
		this.id=id;
		this.title=title;
		this.description=description;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public long getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return description;
	}

}
