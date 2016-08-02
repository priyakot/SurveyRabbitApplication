package controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import api.controller.Application;

/**
 * @author Priya Kotwal
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserControllerTests {

	@Autowired
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {
		//{"uid":1234,"userType":"admin","userName":"Priya"}
	/**	this.mockMvc.perform(get("/api/get_user"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.uid").value(1234))
				.andExpect(jsonPath("$.userType").value("admin"))
				.andExpect(jsonPath("$.userName").value("Priya"));**/
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {

	/**	this.mockMvc.perform(get("/api/get_user").param("name", "Priya"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.uid").value(1234))
				.andExpect(jsonPath("$.userType").value("admin"))
				.andExpect(jsonPath("$.userName").value("Priya"));**/
	}

}
