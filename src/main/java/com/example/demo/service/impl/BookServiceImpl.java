package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BookMapper;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

	@Override
	public List<Book> findBook(String name) {
		// TODO Auto-generated method stub
		return bookMapper.findBook(name);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bookMapper.delete(id);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookMapper.update(book);
	}

	@Override
	public Book findAuthor(Integer id) {
		// TODO Auto-generated method stub
		return bookMapper.findAuthor(id);
	}

}
