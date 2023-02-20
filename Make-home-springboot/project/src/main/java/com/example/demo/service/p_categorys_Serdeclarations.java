package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.productcategorys;

public interface p_categorys_Serdeclarations {
	public List <productcategorys> showAll();
	public productcategorys fetchById(int id);
	public void insorup(productcategorys furniture);
	public void delete(int id);

}
