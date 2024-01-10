package com.rays.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	public static ApplicationContext context = null;

	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");
		// test.testAdd();
		// test.testupdate();
		// test.testdelete();
	//	test.testsearch();
		test.testfindByLogin();

	}

	private void testfindByLogin() {
		// TODO Auto-generated method stub
		UserDTO dto = service.findByLogin("khushali@gmail.com");
		System.out.println(dto.getId());
		System.out.println(dto.getFistName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin() );
		System.out.println("finf by login");
		
		
		  
		
	}

	private void testsearch() {
		// TODO Auto-generated method stub}
		UserDTO dto = new UserDTO();
		System.out.println("service->" + service);
		List<UserDTO> l = service.search(dto, 1, 5);
		l.forEach(e -> {
			System.out.print(e.getId());
			System.out.print("\t" + e.getFistName());
			System.out.print("\t" + e.getLastName());
			System.out.print("\t" + e.getLogin());
			System.out.println("\t" + e.getPassword());
		});
		
		
	}

	/*
	 * private void testdelete() { // TODO Auto-generated method stub UserDTO dto =
	 * new UserDTO(); dto.setId(2); service.delete(id);
	 * System.out.println("user deleted");
	 */
	//}

	private void testupdate() {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFistName("khushali");
		dto.setLastName("rathore");
		dto.setLogin("khushali@gmail.com");
		dto.setPassword("1234");
		service.update(dto);
		System.out.println("user Updated");

	}

	private void testAdd() {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFistName("khushali");
		dto.setLastName("rathore");
		dto.setLogin("khushalirathod700@gail.com");
		dto.setPassword("1234");
		long pk = service.add(dto);
		System.out.println("PK->" + pk);

	}

}
