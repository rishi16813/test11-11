package com.restapi11.service;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.restapi11.entity.Admin;
import com.restapi11.entity.User1;

public class ServiceAdminDetailImpl implements UserDetails {

	private User1 user1;

public ServiceAdminDetailImpl(User1 user1) {
	// TODO Auto-generated constructor stub
}

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
HashSet<SimpleGrantedAuthority>set = new HashSet<>();
SimpleGrantedAuthority mySga= new SimpleGrantedAuthority(user1.getRole());
set.add(mySga);
	return set;
}

@Override
public String getPassword() {
	
	return user1.getUserPassword();
}

@Override
public String getUsername() {
	
	return user1.getUserName();
}

@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
}


}
