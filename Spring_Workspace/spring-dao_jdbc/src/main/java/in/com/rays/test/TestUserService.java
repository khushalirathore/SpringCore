package in.com.rays.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import in.com.rays.dto.UserDTO;
import in.com.rays.service.UserServiceInt;

@Component("TestUserService")
public class TestUserService {

	
	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("TestUserService");

		 test.testAdd();
		//test.testUpdate();
		//test.testDelete();
		//test.testFindByPk();
		//test.testAuth();
	//test.testSearch();

	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setId(7);
		dto.setFirstName("khushi");
		dto.setLastName("rat");
		dto.setLogin("xyz@gmail.com");
		dto.setPassword("pass1234");
		long pk = service.add(dto);
		System.out.println("Data Inserted... pk = " + pk);
	}
	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("khusiii");
		dto.setLastName("rathore");
		dto.setLogin("khushali@gmail.com");
		dto.setPassword("12345");
		service.update(dto);
		System.out.println("Data updated  " + dto.getId() + "for " + dto.getFirstName());
	}

	private void testDelete() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
				
		service.delete(1L);
		
		System.out.println("deleted successfully....!!!!!");
		
	}

	public void testFindByPk() {
		UserDTO dto = service.findByPK(2);
		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
		} else {
			System.out.println("User ID not exist..!!!");
		}
	}

	public void testAuth() {
		UserDTO dto = service.authenticate("xyz@gmail.com", "pass1234");
		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
		} else {
			System.out.println("User not exist");
		}
	}

	public void testSearch() {
		UserDTO dto = new UserDTO();
		List<UserDTO> l = service.search(dto, 0, 5);
		l.forEach(e -> {
			System.out.print(e.getId());
			System.out.print("\t" + e.getFirstName());
			System.out.print("\t" + e.getLastName());
			System.out.print("\t" + e.getLogin());
			System.out.println("\t" + e.getPassword());
		});
	}


	}

	