package com.restapi11.service;

import java.util.List;

import com.restapi11.entity.Admin;

public interface Service {

	public int resisterEntity(Admin admin);
	public List<Admin>getAll();
	public Admin getByName(String name);
	public void updateById(Admin admin,int id);
	public void deleteByName(String name);
}
