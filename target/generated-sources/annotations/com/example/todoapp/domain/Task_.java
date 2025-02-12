package com.example.todoapp.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;

@StaticMetamodel(Task.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Task_ {

	public static final String DUE_DATE = "dueDate";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String COMPLETED = "completed";
	public static final String TITLE = "title";

	
	/**
	 * @see com.example.todoapp.domain.Task#dueDate
	 **/
	public static volatile SingularAttribute<Task, Instant> dueDate;
	
	/**
	 * @see com.example.todoapp.domain.Task#description
	 **/
	public static volatile SingularAttribute<Task, String> description;
	
	/**
	 * @see com.example.todoapp.domain.Task#id
	 **/
	public static volatile SingularAttribute<Task, Long> id;
	
	/**
	 * @see com.example.todoapp.domain.Task#completed
	 **/
	public static volatile SingularAttribute<Task, Boolean> completed;
	
	/**
	 * @see com.example.todoapp.domain.Task#title
	 **/
	public static volatile SingularAttribute<Task, String> title;
	
	/**
	 * @see com.example.todoapp.domain.Task
	 **/
	public static volatile EntityType<Task> class_;

}

