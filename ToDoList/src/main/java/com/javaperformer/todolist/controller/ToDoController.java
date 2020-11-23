/**
 * You can interact with this application in the easy way just run "Spring Boot"
 * then go to your browser and type "http://localhost:8080/api/todos/list"
 * You will see the start page of this application.
 * You must enable Internet access for your device while using this application.
 */
package com.javaperformer.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaperformer.todolist.dao.ToDoListDao;
import com.javaperformer.todolist.domain.TaskList;

/**
 * @author Evgeny Novik
 */
@RequestMapping("/api/todos")
@Controller
public class ToDoController {

	@Autowired
	private ToDoListDao dao;

	/*
	 * The method shows entire list of task that need to be completed.
	 */
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.findAll());
		return "list";
	}

	/*
	 * The method inserts a new summary into your task list. If there is no new
	 * summary, the method prompts you to fill out the form again.
	 */
	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.GET })
	public String save(String summary) {
		if (summary == null || summary == "") {
			return "save";
		}
		TaskList task = new TaskList();
		task.setSummary(summary);
		dao.save(task);
		return "completed";
	}

	/*
	 * The method removes the summary from your task list. If there is no summary
	 * ID, you will see the task list again.
	 */
	@RequestMapping("/complete")
	public String complete(Integer id, Model model) {
		if (!dao.existsById(id)) {
			model.addAttribute("list", dao.findAll());
			return "list";
		}
		dao.deleteById(id);
		model.addAttribute("list", dao.findAll());
		if (dao.count() == 0) {
			return "congratulations";
		}
		return "list";
	}

}
