package com.rays.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {
	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		// TODO Auto-generated method stub
		long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		

	}

	public UserDTO delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List searh(UserDTO dto, int pageNo, int PageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List serch(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
