package core.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import core.model.dao.UserDaoImpl;
import core.model.pojo.User;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public UserDetailsService(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDaoImpl.findByUsername(username);
		if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
	}
}
