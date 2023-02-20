package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.productcategorys;
import com.example.demo.service.p_categorys_SerImplementtations2;





@RestController
@RequestMapping("/market")
public class productcategorysController {
	private p_categorys_SerImplementtations2 ems;
    @Autowired
	public productcategorysController(p_categorys_SerImplementtations2 ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/categories") 
	public List<productcategorys> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/categories/{FurnitureId}") 
	public productcategorys receiveById(@PathVariable int FurnitureId)
	{
		productcategorys mp=ems.fetchById(FurnitureId);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted with this id :"+FurnitureId);
		return mp;	
	}

	

}
