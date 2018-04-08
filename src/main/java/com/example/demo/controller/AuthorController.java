package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;

@Controller
@RequestMapping(value="author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("authors",authorService.findAll());
		return "author/list";
	}
	
	@RequestMapping("findBook")
	public String findBook(Model model,Integer id) {
		System.out.println(id);
		model.addAttribute("authors",authorService.findBook(id));
		return "author/book";
	}
}
