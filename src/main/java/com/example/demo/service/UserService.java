package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
List<User> findAll();
List<User>findUser(Integer id);
void delete(Integer id);
}
