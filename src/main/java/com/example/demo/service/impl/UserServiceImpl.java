package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	@Override
	public void delete(Integer id) {
		userMapper.delete(id);
		
	}
	@Override
	public List<User> findUser(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findUser(id);
	}

}
