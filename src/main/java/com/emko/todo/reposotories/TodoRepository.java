package com.emko.todo.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emko.todo.db.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
