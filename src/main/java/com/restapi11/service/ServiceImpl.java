package com.restapi11.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi11.entity.Admin;
import com.restapi11.repository.AdminRepo;

@Service
public class ServiceImpl implements com.restapi11.service.Service {
@Autowired
	private AdminRepo repo;

@Override
public int resisterEntity(Admin admin) {
	Admin save = repo.save(admin);
	if (save != null) {
		return 1;
	}else {
		return 0;
	}
	
}

@Override
public List<Admin> getAll() {
	List<Admin> findAll = repo.findAll();
	return findAll;
}



@Override
public void updateById(Admin admin, int id) {
	admin.getAdminId();
	Admin save = repo.save(admin);
	
}




@Override
public Admin getByName(String name) {
	Optional<Admin> findByAdminName = repo.findByAdminName(name);
	return findByAdminName.get();
}

@Override
public void deleteByName(String name) {
	repo.deleteById(name);
	
}
}
