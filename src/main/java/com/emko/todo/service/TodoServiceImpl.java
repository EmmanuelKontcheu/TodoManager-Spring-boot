package com.emko.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.emko.todo.db.model.Todo;
import com.emko.todo.reposotories.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService{
	
	private final TodoRepository todoRepository;
	
	public TodoServiceImpl(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@Override
	public Todo findTodoById(Long id) {		
		return todoRepository.findById(id).get();
	}

	@Override
	public List<Todo> findAllTodos() {
		return todoRepository.findAll();
	}

	@Override
	public Todo saveTodo(Todo todo) {
		return todoRepository.save(todo);
	}

}
