package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	List<Book> findAll();
	List<Book>findBook(String name);
	Book findAuthor(Integer id);
	void delete(Integer id);
	void update(Book book);
}
