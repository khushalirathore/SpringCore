package in.com.rays.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBeanAnnotation {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle2.xml");

		MyBeanAnnotation myBean = (MyBeanAnnotation) context.getBean("myBeanAnnotation");

		((ClassPathXmlApplicationContext) context).close();

	}

}
