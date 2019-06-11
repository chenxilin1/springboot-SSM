package com.qhit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qhit.mapper.StudentMapper;
import com.qhit.pojo.Student;
import com.qhit.pojo.StudentExample;
import com.qhit.service.UserService;



@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private StudentMapper sm;
	@Override
	public List<Student> select() {
		StudentExample se = new StudentExample();
		return sm.selectByExample(se);
	}
	@Override
	public Student selectid(int id) {
		// TODO Auto-generated method stub
		return sm.selectByPrimaryKey(id);
	}
	@Override
	public int addStudent(Student stu) {
		
		return sm.updateByPrimaryKeySelective(stu);
	}

	

}
