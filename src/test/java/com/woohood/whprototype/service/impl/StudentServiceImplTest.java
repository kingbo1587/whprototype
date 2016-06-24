package com.woohood.whprototype.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woohood.whprototype.model.database.Student;
import com.woohood.whprototype.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTest.xml")
public class StudentServiceImplTest {

	@Autowired
	private StudentService studentService;

	@Test
	public void testAddStudentDemo() {
		Student record = new Student();
		record.setName("xiaoming4");
		record.setAge(1);
		int i = studentService.addStudent(record);
		Assert.assertEquals(1, i);
	}

	@Test
	public void testGetStudent() {
		List<Student> list = studentService.getStudent("xiaoming3");
		Assert.assertEquals(2, list.get(0).getStudentId().intValue());
	}

}
