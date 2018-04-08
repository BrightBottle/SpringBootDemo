package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Book;

@Mapper
public interface BookMapper {
	/**
	 * 查询所有书籍
	 */
		@Select("select * from book")
		List<Book> findAll();
		
	/**
	 * 查看单个书籍信息
	 */
		@Select("select * from book where name=#{name}")
		List<Book>findBook(String name);
	/**
	 * 根据id删除书籍
	 */
		@Delete("delete from book where id=#{id}")
		void delete(Integer id);
		
		/**
		 * 修改价格
		 */
		@Update("update book set price=#{price} where name=#{name}")
		void update(Book book);
		
/**
 * 根据书来找作者
 */
		Book findAuthor(Integer id);
	}
