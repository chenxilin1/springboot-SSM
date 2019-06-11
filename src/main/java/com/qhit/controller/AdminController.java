package com.qhit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qhit.pojo.Student;
import com.qhit.service.AdminService;
import com.qhit.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private AdminService as;
	@Autowired
	private UserService us;
	
	@RequestMapping("/admin")
	public String admin(Model model) {
		model.addAttribute("st", "");
		return "admin-table";
	}
	@RequestMapping("/addUser")
	public String addUser() {
		return "addUser";
	}
	@RequestMapping("/delUser")
	public String delUser(Model model) {
		List<Student> list=us.select();
		model.addAttribute("user",list);
		return "delUser";
	}
	@RequestMapping("/editUser")
	public String editUser(Model model) {
		List<Student> list=us.select();
		model.addAttribute("user",list);
		return "editUser";
	}
	@RequestMapping("/addUsers")
	public String addUsers(Student stu,Model model) {
		int i = as.addUsers(stu);
		
		if (i==1) {
			model.addAttribute("st", "添加成功！");
		}else{
			model.addAttribute("st", "添加失败！");
		}
		return "admin-table";
	}
	@RequestMapping("/delUsers")
	public String delUsers(int id,Model model) {
		int i = as.delUsers(id);
		
		if (i==1) {
			model.addAttribute("st", "删除成功！");
		}else{
			model.addAttribute("st", "删除失败！");
		}
		return "admin-table";
	}
	@RequestMapping("/editUsers")
	public String editUsers(Student stu,Model model) {
		System.out.println(stu.getId()+stu.getName());
		int i = as.editUsers(stu);
		
		if (i==1) {
			model.addAttribute("st", "编辑成功！");
		}else{
			model.addAttribute("st", "编辑失败！");
		}
		return "admin-table";
	}
}
