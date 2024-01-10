package in.com.rays.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.com.rays.dto.UserDTO;

public class UserMapper implements RowMapper {

	public UserDTO mapRow(ResultSet rs, int rownum) throws SQLException {
		UserDTO user = new UserDTO();
		user.setId(1);
		user.setFirstName(rs.getString(2));
		user.setLastName(rs.getString(3));
		user.setLogin(rs.getString(4));
		user.setPassword(rs.getString(5));
		
		
		return user;

	}

}
