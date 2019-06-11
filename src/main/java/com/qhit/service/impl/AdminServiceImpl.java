package com.qhit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qhit.mapper.StudentMapper;
import com.qhit.pojo.Student;
import com.qhit.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private StudentMapper sm;
	@Override
	public int addUsers(Student stu) {
		return sm.insertSelective(stu);
	}
	@Override
	public int delUsers(int id) {
		
		return sm.deleteByPrimaryKey(id);
	}
	@Override
	public int editUsers(Student stu) {
		// TODO Auto-generated method stub
		return  sm.updateByPrimaryKeySelective(stu);
	}

}
