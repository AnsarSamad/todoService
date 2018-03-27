package com.igt.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.igt.entity.ToDo;
import com.igt.service.ToDoService;

@CrossOrigin
@RestController
@RequestMapping("/todoservice")
public class ToDOController {

	@Autowired
	ToDoService todoService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ToDo addToDo(@RequestBody String todo) {
		return todoService.add(todo);
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public boolean removeTodo(@RequestBody String todoId) {
		todoService.remove(Long.valueOf(todoId));
		return true;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ToDo updateToDo(@RequestBody ToDo todo) {
		return todoService.update(todo);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public boolean removeTodo() {
		return true;
	} 
}
