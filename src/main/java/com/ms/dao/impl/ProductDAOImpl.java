package com.ms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ms.dao.ProductDAO;
import com.ms.entity.Product;

@Repository("repo_one")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
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
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class, id);
		session.close();
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
