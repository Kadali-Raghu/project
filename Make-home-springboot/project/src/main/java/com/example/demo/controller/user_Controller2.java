package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.user;

import com.example.demo.service.p_user_SerImplementtations3;





@RestController
@RequestMapping("/market")
public class user_Controller2 {
	private p_user_SerImplementtations3 ems;
    @Autowired
	public user_Controller2(p_user_SerImplementtations3 ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/user") 
	public List<user> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/user/{FurnitureId}") 
	public user receiveById(@PathVariable int FurnitureId)
	{
		user mp=ems.fetchById(FurnitureId);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted with this id :"+FurnitureId);
		return mp;	
	}
	@PostMapping("/user")
	public void addFurniture(@RequestBody user user)
	{
		user.setU_id(0);
		ems.insorup(user);
	}

	

}
