package com.javacourse.proect.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.proect.hibernateAndJpa.Business.ITaskService;
import com.javacourse.proect.hibernateAndJpa.Entities.*;

@RestController
@RequestMapping("/api")
public class TaskController {
	
	private ITaskService taskService;

	@Autowired
	public TaskController(ITaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping("/tasks")
	public List<Task> get(){
		return taskService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Task task) {
		taskService.add(task);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Task task) {
		taskService.update(task);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Task task) {
		taskService.delete(task);
	}
	
	@GetMapping("/tasks/{id}")
	public Task getById(@PathVariable int id){
		return taskService.getById(id);
	}
}
