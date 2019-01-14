package com.org.fossil.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.fossil.Model.Product;


public interface ProductService {

public List<Product> getAllProducts();	

public Optional<Product> getProductById(Long productId);
	
}
