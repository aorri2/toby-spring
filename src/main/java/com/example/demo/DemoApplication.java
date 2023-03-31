package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.user.dao.UserDao;
import com.example.demo.user.domain.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UserDao dao = new UserDao();

		User user = new User();
		user.setId("wook");
		user.setName("종욱");
		user.setPassword("devloper");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");

		SpringApplication.run(DemoApplication.class, args);
	}

}
