package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

public interface AuthorService {
List<Author> findAll();
Author findBook(Integer id);
}
