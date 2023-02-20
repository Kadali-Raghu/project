package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.items;

public interface FurnitureSerdeclarations {
	public List <items> showAll();
	public items fetchById(int id);
	public void insorup(items furniture);
	public void delete(int id);
//	public List<items> findbiKeyword(String Keyword);
//	public List<items> Search(String data);
//	public List<items> Search(int data);
	public List<items> search(String data);
	public List<items> searchca(int data);

}
