package dem.web;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome Servlet");
//		Print HTML to the browser
		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Welcome Servlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Welcome to the world of servlets</h1>");
//		out.println("</body>");
//		out.println("</html>");
		
		out.println("<html><head><title>Welcome Servlet</title></head><body><h1>Welcome to the world of servlets............</h1></body></html>");
	}
}
