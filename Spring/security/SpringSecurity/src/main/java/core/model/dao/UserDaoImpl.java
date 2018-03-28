package core.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import core.model.pojo.User;

@Repository
public class UserDaoImpl {
	@Autowired
	private DataSource dataSource;
	
	public UserDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public User findByUsername(String username) {
		User user = null;
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT USERNAME,PASSWORD, ENABLED FROM USERS WHERE USERNAME = ?")
		){
			pstmt.setString(1, username);
			try(ResultSet rs = pstmt.executeQuery()){
				if (rs.next()) {
					user = new User();
					user.setUsername(rs.getString(1));
					user.setPassword(rs.getString(2));
					user.setEnabled(rs.getBoolean(3));
					user.setRoleList(findRoleByUsername(user.getUsername()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	private List<String> findRoleByUsername(String username) {
		List<String> roleList = null;
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT ROLE FROM USER_ROLES WHERE USERNAME = ?")	
		){
			pstmt.setString(1, username);
			try(ResultSet rs = pstmt.executeQuery()){
				if (rs.next()) {
					roleList = new ArrayList<>();
					roleList.add(rs.getString(1));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roleList;
	}
}
