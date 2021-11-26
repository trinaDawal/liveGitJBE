<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Display Product Details</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Products List</h1>
	<table class="table table-dark table-striped" style="width: 500px">
		<tr>
			<th>Product ID</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<%
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root",
						"mysql");
				Statement selectStatement = mySQLConnection.createStatement();
				String queryString = "SELECT * FROM PRODUCTS";
				ResultSet resultSet = selectStatement.executeQuery(queryString);
				//			System.out.println("ITERATING THROUGH THE RESULT SET AND FETCHING THE ROWS");
				boolean found = false;

				while (resultSet.next()) {
					found = true;
					int productId = resultSet.getInt("PRODUCT_ID");
					String productName = resultSet.getString("PRODUCT_NAME");
					float price = resultSet.getFloat("PRICE");
					System.out.println(productId + "  >  " + productName + "  >  " + price);
		%>
		<tr>
			<td><%=productId%></td>
			<td><%=productName%></td>
			<td><%=price%></td>
		</tr>
		<%
			}
				if (!found) {
					System.out.println("No products found....");
				}
			} catch (SQLException sqlException) {
				System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
			} catch (ClassNotFoundException classNotFoundException) {
				System.out.println("UNABLE TO LOAD DRIVER" + classNotFoundException);
			}
		%>
	</table>


</body>
</html>
