package com.qhit.service;

import java.util.List;

import com.qhit.pojo.Student;


public interface UserService {
	List<Student> select();
		Student selectid(int id);
		int addStudent(Student stu);
}
