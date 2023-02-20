package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.entity.productcategorys;

import com.example.demo.persistance.p_categorys_JPAInterfaceRepository2;
@Service
public class p_categorys_SerImplementtations2 implements p_categorys_Serdeclarations {
	private p_categorys_JPAInterfaceRepository2 em;
    @Autowired
	public p_categorys_SerImplementtations2(p_categorys_JPAInterfaceRepository2 em) {
	
		this.em = em;
	}
	
    @Override
    @Transactional
        public List<productcategorys> showAll() {
    	return em.findAll();
    }

    @Override
    @Transactional
         public productcategorys fetchById(int id) {
    	productcategorys mp=em.findById(id).get();
       return mp;
    }

    @Override
    @Transactional
    public void insorup(productcategorys furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int id) {
    em.deleteById(id);
    }

	
	}

	


