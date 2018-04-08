package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
@RequestMapping(value="book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("books",bookService.findAll());
		return "book/list";
	}
	
	@RequestMapping("getBook")
	public String getBook(Model model,String name) {
		System.out.println(name);
		List<Book> book=bookService.findBook(name);
		model.addAttribute("book",book);
		return "book/bookinfo";
	}
	
	@RequestMapping("delete")
	public String delete(Integer id,Model model) {
		System.out.println(id);
		bookService.delete(id);
		model.addAttribute("books",bookService.findAll());
		return "book/list";
	}
	
	@RequestMapping("to_edit")
	public String to_edit(String name,Model model) {
		System.out.println(name);
		model.addAttribute("book",bookService.findBook(name));
		return "book/edit";
	}
	
	@RequestMapping("do_edit")
	public String do_edit(Book book,Model model) {
		bookService.update(book);
		model.addAttribute("books",bookService.findAll());
		return "book/list";
	}
	
	@RequestMapping("findAuthor")
	public String findAuthor(Model model,Integer id) {
		System.out.println(id);
		model.addAttribute("books",bookService.findAuthor(id));
		return "book/author";
	}
}
