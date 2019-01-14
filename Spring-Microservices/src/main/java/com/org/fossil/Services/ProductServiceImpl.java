package com.org.fossil.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.fossil.Daos.ProductDao;
import com.org.fossil.Model.Product;

@Service
public class ProductServiceImpl  implements ProductService{

   @Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public Optional<Product> getProductById(Long productId) {
		 return productDao.findById(productId);
	}

}
