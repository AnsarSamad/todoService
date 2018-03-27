package com.igt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.igt.entity.ToDo;
import com.igt.repositories.ToDoRepositories;



@Service
public class ToDoService {

	@Autowired
	ToDoRepositories todoRepo;
	
	public ToDo add(String todo) {
		ToDo todoItem = new ToDo(todo,false);
		return todoRepo.save(todoItem);
	}
	public void remove(ToDo todo) {
		todoRepo.delete(todo);
	}
	public void remove(Long todoId) {
		todoRepo.delete(todoId);
	}
	public ToDo update(ToDo todo) {
		if(todoRepo.exists(todo.getId())) {
			todoRepo.delete(todo.getId());
		}
		return todoRepo.save(todo);
	}
	public List<ToDo> get() {
		return (List<ToDo>) todoRepo.findAll();
	}
}
