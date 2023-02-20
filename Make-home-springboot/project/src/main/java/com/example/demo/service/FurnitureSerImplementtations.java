package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.items;

import com.example.demo.persistance.FurnitureJPAInterfaceRepository;
@Service
public class FurnitureSerImplementtations implements FurnitureSerdeclarations {
	private FurnitureJPAInterfaceRepository em;
    @Autowired
	public FurnitureSerImplementtations(FurnitureJPAInterfaceRepository em) {
	
		this.em = em;
	}
	
    @Override
    @Transactional
        public List<items> showAll() {
    	return em.findAll();
    }

    @Override
    @Transactional
         public items fetchById(int id) {
    	items mp=em.findById(id).get();
       return mp;
    }

    @Override
    @Transactional
    public void insorup(items furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int id) {
    em.deleteById(id);
    }
    
//    @Override
//    @Transactional
//        public List<items> Search(String data) {
//    	return em.findbyKeyword(data);
//    }
//        @Override
//        @Transactional
//            public List<items> Search(int data) {
//        	return em.findbyKeyword(data);
//        }
            @Override
            @Transactional
            public List<items> search(String data) {
            	return em.findbyKeyword(data);
            }
            @Override
            @Transactional
            public List<items> searchca(int data) {
            	return em.findbyKeywordd(data);
            }
    

//	@Override
//	public List<items> findbiKeyword(String Keyword) {
//		// TODO Auto-generated method stub
//		return em.findbyKeyword(Keyword);
//	}

	

}
