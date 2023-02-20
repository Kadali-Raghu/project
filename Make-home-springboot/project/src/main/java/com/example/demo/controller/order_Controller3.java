package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.items;
import com.example.demo.entity.oders;
import com.example.demo.entity.productcategorys;
import com.example.demo.entity.user;
import com.example.demo.service.p_categorys_SerImplementtations2;
import com.example.demo.service.p_order_SerImplementtations4;
import com.example.demo.service.p_user_SerImplementtations3;





@RestController
@RequestMapping("/market")
public class order_Controller3 {
	private p_order_SerImplementtations4 ems;
    @Autowired
	public order_Controller3(p_order_SerImplementtations4 ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/orders") 
	public List<oders> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/orders/{o_id}") 
	public oders receiveById(@PathVariable int o_id)
	{
		oders mp=ems.fetchById(o_id);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted with this id :"+o_id);
		return mp;	
	}
	@PostMapping("/orders")
	public void addorders(@RequestBody oders furniture)
	{
		furniture.setO_id(0);
		ems.insorup(furniture);
	}
	@PutMapping("/orers")
	public void updateorders(@RequestBody oders furniture)
	{
	
		ems.insorup(furniture);
	}
	@DeleteMapping("/orders/{o_id}")
	  public String deleteOnId(@PathVariable int o_id) {
		  oders h = ems.fetchById(o_id);
		  if(h==null)
			  throw new RuntimeException(" data not existed to delete:"+o_id);
		  ems.delete(o_id);
		      return "Deleted Food id is :"+o_id;
	  }
	@GetMapping("/count1/{u_id}")
	public int getCount(@PathVariable int u_id) {
		return ems.Count(u_id);
	}
	@GetMapping("/ords/{u_id}") 
	public List <oders> receiveByuId(@PathVariable int u_id)
	{
		 List <oders> mp=ems.byid(u_id);
		
		return mp;	
	}
	@DeleteMapping("/del_u/{u_id}")
	  public String delete(@PathVariable int u_id) {
		List <oders> h = ems.byid(u_id);
		  if(h==null)
			  throw new RuntimeException(" data not existed to delete:"+u_id);
		  ems.delete1(u_id);
		      return "Deleted Food id is :"+u_id;
	
	}

}
