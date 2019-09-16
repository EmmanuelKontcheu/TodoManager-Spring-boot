package com.emko.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.emko.todo.db.model.Todo;
import com.emko.todo.service.TodoService;

@RestController
@RequestMapping(TodoController.BASE_URL)
public class TodoController {
	
	public static final String BASE_URL ="api/v1/todos";
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getAllTodos(){
		return todoService.findAllTodos();
	}
	
	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable Long id){
		return todoService.findTodoById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoService.saveTodo(todo);
	}
}
