package com.emko.todo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.emko.todo.db.model.Todo;

public interface TodoService {

	Todo findTodoById(Long id);
	
	List<Todo> findAllTodos();

	Todo saveTodo(Todo todo);
}
