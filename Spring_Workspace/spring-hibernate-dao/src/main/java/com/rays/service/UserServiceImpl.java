package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt {
	@Autowired
	private UserDAOInt dao = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		// TODO Auto-generated method stub
		long pk = dao.add(dto);

		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		dao.update(dto);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public UserDTO delete(long id) {
		// TODO Auto-generated method stub
		UserDTO deleteUser = dao.delete(id);
		return deleteUser;
	}

	@Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub

		return dao.findByLogin(login);

	}

	@Transactional(readOnly = true)
	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub

		return findByPK(pk);
	}

	@Transactional(readOnly = true)
	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		
		return dao.search(dto, pageNo, pageSize);
	}

	@Transactional(readOnly = true)
	public List serch(UserDTO dto) {
		// TODO Auto-generated method stub
		
		return dao.search(dto);
	}

	@Transactional(readOnly = true)
	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		UserDTO user = dao.authenticate(login, password);
		return user;
	}

}
