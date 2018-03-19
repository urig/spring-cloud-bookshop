package com.example.inventory;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InventoryApplication.class)
@WebAppConfiguration
public class ComponentTests {

	@Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

	@Test
	public void getBook_id1_returnsMobyDick() throws Exception {
		mockMvc.perform(get("/books/1"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8.toString()))
			.andExpect(jsonPath("$.id", is(1)))
			.andExpect(jsonPath("$.title", is("Moby Dick")))
			.andExpect(jsonPath("$.author", is("Herman Melville")))
			.andExpect(jsonPath("$.price", is(30.0)))
			.andExpect(jsonPath("$.numberOfCopies", is(10)));
	}

}
