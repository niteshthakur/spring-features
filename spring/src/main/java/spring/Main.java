package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
		System.out.println("Done loading context");
	}

}
