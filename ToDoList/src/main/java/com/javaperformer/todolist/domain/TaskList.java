/**
 * You can interact with this application in the easy way just run "Spring Boot"
 * then go to your browser and type "http://localhost:8080/api/todos/list"
 * You will see the start page of this application.
 * You must enable Internet access for your device while using this application.
 */
package com.javaperformer.todolist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Evgeny Novik.
 */
@Entity
public class TaskList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String summary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
