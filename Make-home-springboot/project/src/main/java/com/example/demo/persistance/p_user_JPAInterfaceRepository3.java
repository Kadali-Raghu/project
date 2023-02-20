package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.entity.productcategorys;
import com.example.demo.entity.user;
@RepositoryRestResource
public interface p_user_JPAInterfaceRepository3 extends JpaRepository<user, Integer>{

}
