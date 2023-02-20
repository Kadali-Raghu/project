package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.entity.productcategorys;
import com.example.demo.entity.user;
import com.example.demo.persistance.p_categorys_JPAInterfaceRepository2;
import com.example.demo.persistance.p_user_JPAInterfaceRepository3;
@Service
public class p_user_SerImplementtations3 implements p_user_Serdeclarations2 {
	private p_user_JPAInterfaceRepository3 em;
    @Autowired
	public p_user_SerImplementtations3(p_user_JPAInterfaceRepository3 em) {
	
		this.em = em;
	}
	
    @Override
    @Transactional
        public List<user> showAll() {
    	return em.findAll();
    }

    @Override
    @Transactional
         public user fetchById(int id) {
    	user mp=em.findById(id).get();
       return mp;
    }

    @Override
    @Transactional
    public void insorup(user furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int id) {
    em.deleteById(id);
    }

	
	}

	


