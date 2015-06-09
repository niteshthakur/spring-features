package spring.web.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {

	//@RequestMapping("/controller21")
	@RequestMapping(value={"/controller211", "controller212", "controller213"})
	public ModelAndView doWork1(){
		
		System.out.println("***********Controller 2 called for  /controller21***************");
		ModelAndView model = new ModelAndView();
		model.addObject("message", "************From controller 2************");
		return  model;
		
	}
	
	@RequestMapping("/controller22")
	public void doWork2(HttpServletRequest req , HttpServletResponse resp) throws IOException{
		
		System.out.println("***********Controller 2 called  for /controller22***************" + req);
		
		String html = "<html><body><h1>hello world</h1></body><html>";
		resp.setContentType("text/plain");
			resp.getWriter().write(html);
			resp.sendRedirect("http://jenkov.com");

		//return  model;
		
	}
}
