package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

@Mapper
public interface AuthorMapper {

/**
 * 查询所有作者
 * @return
 */
@Select("select * from author")
List<Author> findAll();

/**
 * 查找作者对应的书
 * @return
 */
//@Select("select * from book as b where b.author_key=#{id}")
Author findBook(Integer id);
}
