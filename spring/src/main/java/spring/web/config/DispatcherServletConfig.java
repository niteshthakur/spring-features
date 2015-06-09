package spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import spring.web.controllers.Controller1;
import spring.web.controllers.Controller2;

//alternate for xml based configuration - will serve as the web app context definition for dispatcher servlets
//it is made part of. This configuration can be detected through context component scan in xml or explicitily
//registering this config class with an instantiated context as being done here. This class can also enable component 
//scanning as it is annotated by @configuration
@Configuration
@EnableWebMvc
@ComponentScan("spring.web.controllers")
public class DispatcherServletConfig /*extends WebMvcConfigurerAdapter*/ {

	
	@Bean(name="/controller1")
	public Controller1 getController1(){
		System.out.println("Controller1 initialized");
		return new Controller1();
	}
	
	/*@Bean(name="controller2")
	public Controller2 getController2(){
		System.out.println("Controller2 initialized");
		return new Controller2();
	}*/
	
	
	
}
