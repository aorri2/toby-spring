package com.example.demo.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
	public DConnectionMaker() {
	}

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("D사의 독자적인 방법으로 Connection을 생성합니다.");
		Connection c = DriverManager.getConnection(
			"jdbc:mysql://localhost/springbook", "root", "1234");
		return c;
	}
}