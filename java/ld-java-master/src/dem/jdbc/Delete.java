package dem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			System.out.println("CONNECTING");
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
			System.out.println("CREATING STATEMENT");
			Statement deleteStatement = mySQLConnection.createStatement();
			System.out.println("EXECUTING QUERY AND OBTAINING NO OF ROWS AFFECTED (deleted)");
//			Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
			int rowCount = deleteStatement.executeUpdate("DELETE FROM PRODUCTS WHERE PRODUCT_ID = 3");
			if(rowCount!=0) {
				System.out.println("Deleted : " + rowCount);
			}
			else {
				System.out.println("No Rows Deleted!");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);		
		}
	}
}