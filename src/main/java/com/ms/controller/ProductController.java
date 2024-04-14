package com.ms.controller;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ProductInfoDTO;
import com.ms.entity.Product;
import com.ms.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@RequestMapping(value="findById", produces = "application/json")
	public ProductInfoDTO findProductById() {
		Product product=productService.findById(1);
		ProductInfoDTO productInfoDTO=mapper.map(product, ProductInfoDTO.class);
		return productInfoDTO;
	}
}
