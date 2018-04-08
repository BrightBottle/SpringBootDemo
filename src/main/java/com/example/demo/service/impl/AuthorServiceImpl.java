package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AuthorMapper;
import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorMapper authorMapper;

	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		return authorMapper.findAll();
	}

	@Override
	public Author findBook(Integer id) {
		// TODO Auto-generated method stub
		return authorMapper.findBook(id);
	}
	
	
}
