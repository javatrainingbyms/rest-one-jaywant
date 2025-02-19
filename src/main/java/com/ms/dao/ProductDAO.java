package com.ms.dao;

import java.util.List;

import com.ms.entity.Product;

public interface ProductDAO {
	public Product save(Product product);
	public Product update(Product product);
	public Product findById(int id);
	public List<Product> findAll();
	public List<Product> findByBrand(String brand);
	public Product deleteById(int id);
	
	
	
}
