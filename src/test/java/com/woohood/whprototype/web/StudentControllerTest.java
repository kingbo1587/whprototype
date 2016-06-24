package com.woohood.whprototype.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextTest.xml", "classpath:springMVC.xml" })
@WebAppConfiguration
public class StudentControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	/**
	 * 
	 * @function 测试get方式
	 * @description
	 * @throws Exception
	 * @exception/throws [异常类型][异常说明]
	 * @author shenjinbo
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 * @date 2016年2月24日 下午1:49:47
	 * @modify <author> <date> <remark>
	 */
	@Test
	public void testGetById() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/student/getById");
		requestBuilder.param("id", "1");
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
	}

	/**
	 * 
	 * @function 测试post方式
	 * @description
	 * @throws Exception
	 * @exception/throws [异常类型][异常说明]
	 * @author shenjinbo
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 * @date 2016年2月24日 下午1:50:09
	 * @modify <author> <date> <remark>
	 */
	@Test
	public void testGetByIdPost() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/student/getById");
		requestBuilder.param("id", "1");
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
	}

}
