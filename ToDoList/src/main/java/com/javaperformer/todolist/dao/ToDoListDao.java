/**
 * You can interact with this application in the easy way just run "Spring Boot"
 * then go to your browser and type "http://localhost:8080/api/todos/list"
 * You will see the start page of this application.
 * You must enable Internet access for your device while using this application.
 */
package com.javaperformer.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaperformer.todolist.domain.TaskList;

/**
 * Data access object.
 * 
 * @author Evgeny Novik
 */
public interface ToDoListDao extends JpaRepository<TaskList, Integer> {

}
