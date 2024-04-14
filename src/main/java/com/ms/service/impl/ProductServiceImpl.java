package com.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ms.dao.ProductDAO;
import com.ms.entity.Product;
import com.ms.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier("repo_one")
	private ProductDAO productDAO;
	
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		Product product=productDAO.findById(id);
		product.setTax(product.getPrice()*10/100);
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
