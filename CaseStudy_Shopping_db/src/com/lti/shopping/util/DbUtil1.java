package com.lti.shopping.util;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class DbUtil1 {

	private OracleDataSource dataSource;

	public DbUtil1() throws SQLException {
		dataSource = new OracleDataSource();
		String driverType = "thin";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "hr";
		String password = "hr";

		dataSource.setDriverType(driverType);
		dataSource.setUser(userName);
		dataSource.setURL(url);
		dataSource.setPassword(password);

	}

	public Connection getConnectionFromPool() throws SQLException {
		return dataSource.getConnection();
	}

}
