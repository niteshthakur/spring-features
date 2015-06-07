package spring;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebAppBoot implements ServletContainerInitializer {

	public void onStartup(Set<Class<?>> arg0, ServletContext arg1)
			throws ServletException {
		  System.out.println("===============================================");
	        System.out.println("                 onStartup()                   ");
	        System.out.println("===============================================");
		System.out.println("TOMCAT found my initializer");
		
	}

}
