package dem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		try {
			System.out.println("CONNECTING");
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
			System.out.println("CREATING STATEMENT");
			Statement insertStatement = mySQLConnection.createStatement();
			System.out.println("EXECUTING QUERY AND OBTAINING NO OF ROWS AFFECTED");
//			Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
			int rowCount = insertStatement.executeUpdate("INSERT INTO PRODUCTS VALUES (4, 'LOY',780.50)");
			rowCount = rowCount + insertStatement.executeUpdate("INSERT INTO PRODUCTS VALUES (5, 'HP',780.50)");
			if(rowCount!=0) {
				System.out.println("Inserted : " + rowCount);
			}
			else {
				System.out.println("No Rows Inserted!");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);		
		}
	}
}