package com.javaperformer.todolist;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * The class tests some of the requests from an user.
 * 
 * @author Evgeny Novik
 */
@AutoConfigureMockMvc
@SpringBootTest
class ToDoListApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testList() throws Exception {
		this.mockMvc.perform(get("/api/todos/list")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("list"));
		this.mockMvc.perform(get("/api/todos/list")).andDo(print()).andExpect(forwardedUrl("/WEB-INF/views/list.jsp"));
	}

	@Test
	public void testSave() throws Exception {
		this.mockMvc.perform(get("/api/todos/save")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("save"));
		this.mockMvc.perform(get("/api/todos/save?summary=brush your teeth")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("completed"));
		this.mockMvc.perform(get("/api/todos/save?summary=make your bed")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("completed"));
	}

	@Test
	public void testComplete() throws Exception {
		this.mockMvc.perform(get("/api/todos/complete?id=10")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("list"));
		this.mockMvc.perform(get("/api/todos/complete?id=1")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("list"));
		this.mockMvc.perform(get("/api/todos/complete?id=2")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("congratulations"));
	}

}
