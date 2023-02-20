package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.entity.items;
@RepositoryRestResource
public interface FurnitureJPAInterfaceRepository extends JpaRepository<items, Integer>{
	@Query (value="select p from items p where p.name=?1 or p.brand=?1")
	public List <items> findbyKeyword(String data);
	@Query (value="select p from items p where pcid=?1")
	public List <items> findbyKeywordd(int data);
	//public List<items> findProducts(String data);

}
