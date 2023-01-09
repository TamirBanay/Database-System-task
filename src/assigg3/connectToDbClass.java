
package assigg3;

import java.sql.*;
import java.util.Scanner;

public class connectToDbClass {
	// the paht to db------>jdbc:mysql://localhost:3306/sakila

	public static Scanner sc = new Scanner(System.in);

	public static Connection conn;
	public static Statement stmt;

	public connectToDbClass() {

	}

	public void connectToDb() {

		System.out.println("plese write the paht to the db");
		String pahtDb = sc.next();
		// String pahtDb = "jdbc:mysql://localhost:3306/sakila";
		System.out.println("user name?");
		String userName = sc.next();
		System.out.println("password?");
		String password = sc.next();

		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Connecting to sakila database...");
		try {
			conn = DriverManager.getConnection(pahtDb,userName, password);
			stmt = conn.createStatement();
			System.out.println("connection to sakila successfully");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
