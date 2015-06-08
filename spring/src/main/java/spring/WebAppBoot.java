package spring;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import spring.web.servlets.MyServlet;

public class WebAppBoot implements ServletContainerInitializer {

	public void onStartup(Set<Class<?>> arg0, ServletContext context)
			throws ServletException {
		  System.out.println("===============================================");
	        System.out.println("                 onStartup()                   ");
	        System.out.println("===============================================");
		System.out.println("TOMCAT found my initializer");
		
		Dynamic dynamic = context.addServlet("myServlet", MyServlet.class);
		dynamic.addMapping("/api");
		System.out.println("Added myServlet to context");
	}

}
