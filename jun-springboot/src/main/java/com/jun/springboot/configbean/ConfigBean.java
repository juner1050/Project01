package com.jun.springboot.configbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jun.springboot.dao.UserDao;

@Configuration
@ComponentScan(basePackages = "com.jun.springboot")
public class ConfigBean {
	
	@Bean
	public UserDao getUserDao() {
		return new UserDao();
	}

}
