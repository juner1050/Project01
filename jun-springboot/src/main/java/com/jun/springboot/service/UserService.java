package com.jun.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.springboot.dao.UserDao;
import com.jun.springboot.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public List<User> getUserList(){
		return dao.getUserList();
	}

}
