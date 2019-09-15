package com.bsl.MiData.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Pro ConnectionFactory is a class with the help of we can achieve
 *         connection to the db.
 */
public class ConnectionFactory {
	private static Connection connection = null;

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		if (connection == null) {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/midata", "root", "root");
			System.out.println("Connection established");
		}
		return connection;
	}
}
