package dem.web;
// java.lang.* gets imported by default
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//http://localhost:8080/ld-servlets-jsp-web-master/WelcomeServlet
//http = protocol for html documents
//localhost : tomcat on your machine
//ld-servlets-jsp-web-master project called as webcontext
//WelcomeServlet servlet mapping to url
@WebServlet("/SelectConsoleServlet")
public class SelectConsoleServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside the service method of SelectServlet");
		
//		Print HTML to the browser
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Display Product Details</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Product Details are printed on the Tomcat Server Console</h1>");
		try {
			Statement selectStatement = getStatement();
//			Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
//			System.out.println("EXECUTING QUERY AND OBTAINING RESULTSET");
			String queryString = "SELECT * FROM PRODUCTS";
//			System.out.println(queryString);
			ResultSet resultSet =  selectStatement.executeQuery(queryString);
//			System.out.println("ITERATING THROUGH THE RESULT SET AND FETCHING THE ROWS");
			boolean found = false;
			while(resultSet.next()) {
				found = true;
				int productId = resultSet.getInt("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				float price = resultSet.getFloat("PRICE");
				System.out.println(productId + "  >  "+productName+"  >  "+price);
			}
			if(!found) {
				System.out.println("No products found....");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}	
		
		out.println("</body>");
		out.println("</html>");		
	}
	public Statement getStatement() {
		try {
//			APPLICATION IS RUNNING. THE INSTANCE OF CLASSES IN A RUNNING APPLICATION.		
// Class.forName("com.mysql.jdbc.Driver") returns object of com.mysql.jdbc.Driver.
//			class (keyword), Class is class
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("CONNECTING");
//			Attempts to establish a connection to the given database URL.
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
					"mysql");
//			System.out.println("CREATING STATEMENT");
			Statement statement = mySQLConnection.createStatement();
			return statement;
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("UNABLE TO LOAD DRIVER" + classNotFoundException);
		}
		return null;
	}
}
