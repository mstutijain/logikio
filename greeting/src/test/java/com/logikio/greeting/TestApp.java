package com.logikio.greeting;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(AppController.class)
public class TestApp {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/hi"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));
    }
}