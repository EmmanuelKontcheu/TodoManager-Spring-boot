package com.emko.todo.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "todo")
public class Todo {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name; 
}
