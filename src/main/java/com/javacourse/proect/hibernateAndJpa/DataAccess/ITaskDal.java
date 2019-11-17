package com.javacourse.proect.hibernateAndJpa.DataAccess;

import java.util.List;
import com.javacourse.proect.hibernateAndJpa.Entities.Task;

public interface ITaskDal {
	List<Task> getAll();
	void add(Task task);
	void update(Task task);
	void delete(Task task);
	Task getById(int id);
	

}
