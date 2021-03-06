package com.example.demo.model;

public class Book {
private Integer id;
private String name;
private Integer price;
private Author author;


public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
}


}
