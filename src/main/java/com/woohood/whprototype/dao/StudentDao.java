package com.woohood.whprototype.dao;

import java.util.List;

import com.woohood.whprototype.model.database.Student;

public interface StudentDao {

	int addStudent(Student record);

	Student getStudent(Integer studentId);

	List<Student> getStudent(String name);


}

