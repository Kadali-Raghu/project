package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.oders;
import com.example.demo.entity.productcategorys;
import com.example.demo.entity.user;
import com.example.demo.persistance.order_JPAInterfaceRepository4;
import com.example.demo.persistance.p_categorys_JPAInterfaceRepository2;
import com.example.demo.persistance.p_user_JPAInterfaceRepository3;
@Service
public class p_order_SerImplementtations4 implements p_order_Serdeclarations3 {
	private order_JPAInterfaceRepository4 em;
    @Autowired
	public p_order_SerImplementtations4(order_JPAInterfaceRepository4 em) {
	
		this.em = em;
	}
	
    @Override
    @Transactional
        public List<oders> showAll() {
    	return em.findAll();
    }

    @Override
    @Transactional
         public oders fetchById(int o_id) {
    	oders mp=em.findById(o_id).get();
       return mp;
    }

    @Override
    @Transactional
    public void insorup(oders furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int o_id) {
    em.deleteById(o_id);
    }

	@Override
	public int Count(int u_id) {
		// TODO Auto-generated method stub
		return em.getCount(u_id);
	}


	@Override
	public List<oders> byid(int u_id) {
		// TODO Auto-generated method stub
		return em.findAllByu_id(u_id);
	}

	@Override
	public void delete1(int u_id) {
		// TODO Auto-generated method stub
		 em.delu_id(u_id);
		
	}

	
	}

	


