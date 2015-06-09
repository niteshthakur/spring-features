package spring.web.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import spring.domain.json.Employee;

@Controller
@RequestMapping("/controller3")
public class Controller3 {

	//@RequestMapping("/controller3")
	@RequestMapping(method = RequestMethod.GET)
	//@RequestMapping
	public void doWork1(HttpServletResponse resp) throws IOException{
		System.out.println("***********doWork1 Controller 3 called  for /controller3***************" + resp);
		
		String html = "<html><body><h1>hello world</h1></body><html>";
		resp.setContentType("text/plain");
			resp.getWriter().write(html);
			//resp.sendRedirect("http://jenkov.com");
	}
	
	@ResponseBody
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	//@ResponseStatus(HttpStatus.NOT_FOUND)
	public String doWork2(HttpServletResponse resp) throws IOException{
		System.out.println("***********doWork2 Controller 3 called  for /controller3***************" + resp);
		
		String html = "<html><body><h1>hello world from controller 3 dowork2</h1></body><html>";
	//	resp.setContentType("text/plain");
		//	resp.getWriter().write(html);
			return html;
			//resp.sendRedirect("http://jenkov.com");
	}
	
	@ResponseBody
	@RequestMapping(value = "/employee",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Employee doWork3(HttpServletResponse resp) throws IOException{
		System.out.println("***********doWork3 Controller 3 called  for /controller3***************" + resp);
			return new Employee("nitesh",20,23);
	}
}
