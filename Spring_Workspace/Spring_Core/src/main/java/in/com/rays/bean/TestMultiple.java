package in.com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.rays.bean.Person;
import in.com.rays.bean.UserBean;

public class TestMultiple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Multipal.xml");

		UserBean user = (UserBean)  context.getBean(UserBean.class);//context.getBean("user");

		Person person = (Person)   context.getBean(Person.class);//context.getBean("personBean");

		System.out.println("User Name: " + user.getLogin());
		System.out.println("User Password: " + user.getPassword());
		System.out.println("Person Name: " + person.getName());
	}

}