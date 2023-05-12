package com.restapi11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.restapi11.entity.Admin;
import com.restapi11.service.Service;

@RestController
@RequestMapping("/admin")
public class MainController {
	@Autowired
	private Service service;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@PostMapping("/post")
	
	public ResponseEntity<String>resisterInfo(@RequestBody Admin admin){
		admin.getUser1().setUserPassword(passwordEncoder.encode(admin.getUser1().getUserPassword()));
		int i = service.resisterEntity(admin);
		if (i==1) {
			return new ResponseEntity<String>("save success",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("not save",HttpStatus.NOT_FOUND); 
		}
	}
	@PutMapping("/put/{id}")
	public ResponseEntity<String>updateInfo(@RequestBody Admin admin,@PathVariable int id){
		try {
			service.updateById(admin, id);
			return new ResponseEntity<String>("save sucess",HttpStatus.CREATED); 
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("not sucess",HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{name}")
	public ResponseEntity<String>deleteInfo(@PathVariable String name){
		try {
			service.deleteByName(name);
			return new  ResponseEntity<String>("Delete Success",HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Not Deleted",HttpStatus.BAD_REQUEST);
	}
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Admin>>getAllInfo(){
		List<Admin> all = service.getAll();
		if (all.size()<=0) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}else {
				return ResponseEntity.status(HttpStatus.CREATED).body(all);
			}
	}
	@GetMapping("/get/{name}")
	public ResponseEntity<Admin>getById(@PathVariable String name){
		Admin byName = service.getByName(name);
		return new ResponseEntity<Admin>(byName,HttpStatus.OK);
		
	}

}
