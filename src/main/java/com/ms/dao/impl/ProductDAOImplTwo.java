/**
 * 
 */
package com.ms.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ms.dao.ProductDAO;
import com.ms.entity.Product;

@Repository("repo_two")
public class ProductDAOImplTwo implements ProductDAO {

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
		// TODO Auto-generated method stub
		return null;
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
