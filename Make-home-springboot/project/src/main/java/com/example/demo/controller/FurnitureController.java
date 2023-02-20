package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.items;
import com.example.demo.service.FurnitureSerImplementtations;
@RestController
@RequestMapping("/market")
public class FurnitureController {
	private FurnitureSerImplementtations ems;
    @Autowired
	public FurnitureController(FurnitureSerImplementtations ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/Products") 
	public List<items> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/Products/{FurnitureId}") 
	public items receiveById(@PathVariable int FurnitureId)
	{
		items mp=ems.fetchById(FurnitureId);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted with this id :"+FurnitureId);
		return mp;	
	}

	@PostMapping("/Products")
	public void addFurniture(@RequestBody items furniture)
	{
		furniture.setId(0);
		ems.insorup(furniture);
	}

	@PutMapping("/Products")
	public void updateFurniture(@RequestBody items furniture)
	{
		ems.insorup(furniture);
	}

	@DeleteMapping("/Products/{FurnitureId}")
	public void deleteOnId(@PathVariable int FurnitureId)
	{

		ems.delete(FurnitureId);
		
	}
	@GetMapping("/Search/{data}")
    public List<items> searchAll(@PathVariable String data){
		List<items> flist = ems.search(data);
		return flist;
	}
    @GetMapping("/Searchca/{data}")
    public List<items> searchcategory(@PathVariable int data){
	  		List<items> flist = ems.searchca(data);
	  		return flist;
}
	
	
	
	


}

