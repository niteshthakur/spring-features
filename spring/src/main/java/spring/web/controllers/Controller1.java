package spring.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.AbstractController;
import org.w3c.dom.views.AbstractView;

//@RequestMapping("/controller1")
public class Controller1  extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("***********Controller 1 called ***************");
		ModelAndView model = new ModelAndView();
		model.addObject("message", "************From controller 1************");
		///View view = Html
	//	model.setView(view);
		String html = "<html><body><h1>hello world</h1></body><html>";
		response.setContentType("text/html");

		response.getWriter().write(html);
		//return  model;
		return  model;
	}

}
