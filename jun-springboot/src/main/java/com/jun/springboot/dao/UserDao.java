package com.jun.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import com.jun.springboot.entity.User;

public class UserDao {
	
	public List<User> getUserList(){
		List<User> list = new ArrayList<User>();
		for (int i = 1; i <= 10; i++) {
			User u = new User();
			u.setId(i);
			u.setName("鲁班" + i + "号");
			u.setPassword("password_" + i);
			list.add(u);
		}
		
		return list;
	}

}
