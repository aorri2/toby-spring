package com.example.demo.user;

import java.sql.SQLException;

import com.example.demo.user.dao.DaoFactory;
import com.example.demo.user.dao.UserDao;
import com.example.demo.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		UserDao dao = new DaoFactory().userDao();

		User user = new User();
		user.setId("wook");
		user.setName("종욱");
		user.setPassword("devloper");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");
	}
}
