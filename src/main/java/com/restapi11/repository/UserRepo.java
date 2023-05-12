package com.restapi11.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi11.entity.Admin;
import com.restapi11.entity.User1;
@Repository
public interface UserRepo extends JpaRepository<User1, Integer>{
	public Optional <User1> findByUserName(String adminName);
}
