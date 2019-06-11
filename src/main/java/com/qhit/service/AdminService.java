package com.qhit.service;

import com.qhit.pojo.Student;

public interface AdminService {

	int addUsers(Student stu);

	int delUsers(int id);

	int editUsers(Student stu);

}
