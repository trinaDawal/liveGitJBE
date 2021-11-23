package dem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		System.out.println("MENU SKELETON");
		ProductApp productApp = new ProductApp();
		productApp.createProduct();

	}
	public  void createProduct() {
//		CREATE A PRODUCT
			Scanner scanner = new Scanner(System.in);
			System.out.print("PID : ");
			int productId = Integer.parseInt(scanner.nextLine());
			System.out.print("\nNAME : ");
			String productName = scanner.nextLine();
			System.out.print("\nPRICE : ");
			float price = Float.parseFloat(scanner.nextLine());
			
		try {
			System.out.println("CONNECTING");
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
			System.out.println("CREATING STATEMENT");
			Statement insertStatement = mySQLConnection.createStatement();
			System.out.println("EXECUTING QUERY AND OBTAINING NO OF ROWS AFFECTED");
//			Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
			String queryString = "INSERT INTO PRODUCTS VALUES (" + productId + ",'" + productName + "'," + price + ")";
			System.out.println(queryString);
			int rowCount = insertStatement.executeUpdate(queryString);
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
