package com.woohood.whprototype.service;

import java.util.List;

import com.woohood.whprototype.model.database.Student;

public interface StudentService {

	int addStudent(Student record);

	Student getStudent(Integer id);

	List<Student> getStudent(String name);

}
