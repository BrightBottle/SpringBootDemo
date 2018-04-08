package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Mapper
@Repository
public interface UserMapper {
/**
 * 查询所有
 */
	@Select("select * from user")
	List<User> findAll();
	
/**
 * 查看个人信息
 */
	@Select("select * from user where id=#{id}")
	List<User>findUser(Integer id);
/**
 * 根据id删除
 */
	@Delete("delete from user where id=#{id}")
	void delete(Integer id);
}
