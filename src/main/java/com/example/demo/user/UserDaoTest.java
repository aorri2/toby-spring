package com.example.demo.user;

import java.sql.SQLException;

import com.example.demo.user.dao.ConnectionMaker;
import com.example.demo.user.dao.DConnectionMaker;
import com.example.demo.user.dao.UserDao;
import com.example.demo.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);

		User user = new User();
		user.setId("wook");
		user.setName("종욱");
		user.setPassword("devloper");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");
	}
}
