package com.example.demo.model;

import java.util.List;

public class Author {
private Integer a_id;
private String author;
private List<Book> books;


public Integer getA_id() {
	return a_id;
}
public void setA_id(Integer a_id) {
	this.a_id = a_id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}


@Override
public String toString() {
	return "Author [a_id=" + a_id + ", author=" + author + ", books=" + books + "]";
}


}
