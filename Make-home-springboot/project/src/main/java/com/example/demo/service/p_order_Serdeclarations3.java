package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.oders;



public interface p_order_Serdeclarations3 {
	public List <oders> showAll();
	public oders fetchById(int o_id);
	public void insorup(oders furniture);
	public void delete(int o_id);
	public int Count(int u_id);
	public void delete1(int u_id);
	public List <oders> byid(int u_id);
	

}
