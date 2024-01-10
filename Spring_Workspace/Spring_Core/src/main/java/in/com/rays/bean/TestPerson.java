package in.com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.rays.bean.Person;

public class TestPerson {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");
		Person person = (Person) context.getBean("personBean");
		System.out.println("person's name "+ person.getName());
	}

}
