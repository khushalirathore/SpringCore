package com.rays.dao;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserDAOInt {

	public long add(UserDTO dto);

	public void update(UserDTO dto);

	public UserDTO delete(long id);

	public UserDTO findByLogin(String login);

	public UserDTO findByPK(long pk);
	
	public List searh (UserDTO dto, int pageNo , int PageSize);

	public UserDTO authenticate(String login, String password);

	public List serch (UserDTO dto);
	
	
}
