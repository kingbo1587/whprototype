package com.woohood.whprototype.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woohood.whprototype.dao.StudentDao;
import com.woohood.whprototype.dao.mapper.StudentMapper;
import com.woohood.whprototype.model.database.Student;
import com.woohood.whprototype.model.database.StudentExample;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int addStudent(Student record) {
		return studentMapper.insert(record);
	}

	@Override
	public Student getStudent(Integer studentId) {
		return studentMapper.selectByPrimaryKey(studentId);
	}

	@Override
	public List<Student> getStudent(String name) {
		StudentExample example = new StudentExample();
		StudentExample.Criteria criteria = example.createCriteria();
		criteria.andNameLike("%" + name + "%");
		List<Student> list = studentMapper.selectByExample(example);
		return list;
	}

}
