package com.woohood.whprototype.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woohood.whprototype.dao.StudentDao;
import com.woohood.whprototype.model.database.Student;
import com.woohood.whprototype.service.StudentService;

/**
 * 
 * @function 学生Service
 * @description
 * @author shenjinbo
 * @see [相关类/方法](可选)
 * @since [产品/模块版本](可选)
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public int addStudent(Student record) {
		return studentDao.addStudent(record);
	}

	@Override
	public Student getStudent(Integer studentId) {
		return studentDao.getStudent(studentId);
	}

	@Override
	public List<Student> getStudent(String name) {
		return studentDao.getStudent(name);
	}

}
