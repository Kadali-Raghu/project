package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.entity.productcategorys;
@RepositoryRestResource
public interface p_categorys_JPAInterfaceRepository2 extends JpaRepository<productcategorys, Integer>{

}
