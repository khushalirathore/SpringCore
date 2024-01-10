package in.com.rays.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceLocatore {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("instance.xml");

	ServiceLocatore locator = (ServiceLocatore) context.getBean("locator");
	
	locator.getInstance();
	}

}
