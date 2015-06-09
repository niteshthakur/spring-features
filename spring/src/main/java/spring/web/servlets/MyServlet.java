package spring.web.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.MimeType;

public class MyServlet extends HttpServlet {

	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("************Hi There From My servlet***************");
		
		
		Map<String, ? extends ServletRegistration> servletRegistrations = request.getServletContext().getServletRegistrations();
		System.out.println("**************retrieved all servlets***********");
		
		//String html = "<html><body><h1>hello world</h1></body><html>";
		String json = "{name1:value1,name2:value2}";
	//	resp.setContentType("application/json");
		resp.setContentType("text/plain");
		resp.getWriter().write(json);
	}
	
	

}
