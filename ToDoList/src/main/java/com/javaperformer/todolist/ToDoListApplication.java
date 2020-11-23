/**
 * You can interact with this application in the easy way just run "Spring Boot"
 * then go to your browser and type "http://localhost:8080/api/todos/list"
 * You will see the start page of this application.
 * You must enable Internet access for your device while using this application.
 */
package com.javaperformer.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Evgeny Novik
 */
@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
}
