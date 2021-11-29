package dem.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	read inputs from html form data
		String productIdString = request.getParameter("pProductID");
		int productId = Integer.parseInt(productIdString);
		String productName = request.getParameter("pProductName");
		String priceString = request.getParameter("pPrice");
		float price = Float.parseFloat(priceString);
		System.out.println(productId + ">" + productName + ">" + price);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
			if (rowCount != 0) {
				System.out.println("Inserted : " + rowCount);
			} else {
				System.out.println("No Rows Inserted!");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("UNABLE TO LOAD DRIVER" + classNotFoundException);
		}
	}
}
