package dem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		try {
			System.out.println("CONNECTING");
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
			System.out.println("CREATING STATEMENT");
			Statement selectStatement = mySQLConnection.createStatement();
			System.out.println("EXECUTING QUERY AND OBTAINING RESULTSET");
			ResultSet resultSet =  selectStatement.executeQuery("SELECT * FROM PRODUCTS");
			System.out.println("ITERATING THROUGH THE RESULT SET AND FETCHING THE ROWS");
			while(resultSet.next()) {
				int productId = resultSet.getInt("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				float price = resultSet.getFloat("PRICE");
				System.out.println(productId + "  >  "+productName+"  >  "+price);
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);		
		}
	}
}