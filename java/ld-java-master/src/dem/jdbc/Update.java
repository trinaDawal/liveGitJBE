package dem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		try {
			System.out.println("CONNECTING");
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
			System.out.println("CREATING STATEMENT");
			Statement updateStatement = mySQLConnection.createStatement();
			System.out.println("EXECUTING QUERY AND OBTAINING NO OF ROWS AFFECTED");
//			Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
			int rowCount = updateStatement.executeUpdate("UPDATE PRODUCTS SET PRODUCT_NAME = 'MSFM' WHERE PRODUCT_ID = 4");
			if(rowCount!=0) {
				System.out.println("Updated : " + rowCount);
			}
			else {
				System.out.println("No Rows Upated!");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);		
		}
	}
}