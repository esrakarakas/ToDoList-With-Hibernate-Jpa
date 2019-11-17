package com.javacourse.proect.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task{
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="priority")
	private int priority;
	
	public Task(int id, String name, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
	}
	public Task() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
