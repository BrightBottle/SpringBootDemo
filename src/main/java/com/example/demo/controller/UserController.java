package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("users",userService.findAll());
		return "user/list";
	}
	
	@RequestMapping("getUser")
	public String getUser(Model model,Integer id) {
		
		model.addAttribute("user",userService.findUser(id));
		return "user/userinfo";
	}
	
	@RequestMapping("delete")
	public String delete(Integer id,Model model) {
		System.out.println(id);
		userService.delete(id);
		model.addAttribute("users",userService.findAll());
		return "user/list";
	}
}
