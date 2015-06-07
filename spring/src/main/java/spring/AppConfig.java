package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean(name="bean1")
	public Bean1 bean1(){
		System.out.println("bean1 initialized");
		return new Bean1();
	}
	
	
}
