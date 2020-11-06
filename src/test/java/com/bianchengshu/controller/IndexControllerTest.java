package com.bianchengshu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IndexControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api"))
                .andExpect(MockMvcResultMatchers.status().isOk());

        //ContentResultMatchers c = MockMvcResultMatchers.content();
        //System.out.println(c.toString());
        //.andExpect(MockMvcResultMatchers.content().)
    }

}
