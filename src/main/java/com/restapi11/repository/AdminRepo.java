package com.restapi11.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi11.entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, String>{
	public Optional <Admin> findByAdminName(String adminName);

}
