package com.qhit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qhit.pojo.Student;
import com.qhit.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService us;


	@RequestMapping("/")
	public String index(Model model) {
		List<Student> list=us.select();
		model.addAttribute("user",list);
		return "show";
	}
	@RequestMapping("/editA")
	public String editA(Model model,int id) {
		Student list=us.selectid(id);
		model.addAttribute("user",list);
		return "edit";
	}
	
	@RequestMapping("/edit")
	public String edit(Student student) {
		int i=us.addStudent(student);
		if(i==1) {
			return "redirect:/";	
		}
		return "error";
	}
	
}
