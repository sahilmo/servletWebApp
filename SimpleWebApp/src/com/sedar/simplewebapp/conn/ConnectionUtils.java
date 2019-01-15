package com.sedar.simplewebapp.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// Here I using MySql Database.
		// (You can change to use another database.)
		return MySQLConnUtils.getMySQLConnection();
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}
	public static void rollBack(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
	
}
