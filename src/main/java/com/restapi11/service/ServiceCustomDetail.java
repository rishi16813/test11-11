package com.restapi11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restapi11.entity.Admin;
import com.restapi11.entity.User1;
import com.restapi11.repository.AdminRepo;
import com.restapi11.repository.UserRepo;

@Service
public class ServiceCustomDetail implements UserDetailsService{
@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) {
		User1 user1 = repo.findByUserName(username).get();
		if (user1 == null) {
			throw new UsernameNotFoundException("Not Found");
		}else {
			System.out.println(user1+"find");
			return new ServiceAdminDetailImpl(user1);
			
		}

}
}