
package assigg3;

import java.sql.*;
import java.util.Scanner;

public class main {
	public static Scanner sc = new Scanner(System.in);

	// the paht to db------>jdbc:mysql://localhost:3306/sakila

	public static void main(String[] args) {

		connectToDbClass connToDb = new connectToDbClass();
		connToDb.connectToDb();

		menuClass menu = new menuClass(connToDb.conn, connToDb.stmt);
		menu.menu();
		System.out.println();
//		
	}

}