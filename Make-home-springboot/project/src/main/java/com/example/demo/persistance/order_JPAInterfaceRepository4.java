package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.oders;
//import com.example.demo.entity.productcategorys;
//import com.example.demo.entity.user;
@RepositoryRestResource
public interface order_JPAInterfaceRepository4 extends JpaRepository<oders, Integer>{
	@Query(value="select o from oders o where u_id=?1")
	public List<oders> findAllByu_id(int u_id);
	@Query(value="select count(o)from oders o where u_id=?1")
	public int getCount(int u_id);
	
//	@Query("select o from oders o where name = ?1 ")
//	public List<oders> findOrders(String data);
	

@Query(value="select o from oders o where u_id=?1")
public void delu_id(int u_id);
}
