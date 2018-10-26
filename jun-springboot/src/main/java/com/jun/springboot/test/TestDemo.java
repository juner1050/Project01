package com.jun.springboot.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jun.springboot.configbean.ConfigBean;
import com.jun.springboot.entity.User;
import com.jun.springboot.service.UserService;

public class TestDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
		UserService userService = context.getBean(UserService.class);
		//测试冲突
		List<User> list = userService.getUserList();
		for (User user : list) {
			System.out.println(user.getId() + "... " + user.getName() + "... " + user.getPassword());
		}
		context.destroy();
	}

}
