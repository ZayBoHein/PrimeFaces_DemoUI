package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection con=null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		} catch (ClassNotFoundException e) {
			System.out.print("Driver class not found!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}