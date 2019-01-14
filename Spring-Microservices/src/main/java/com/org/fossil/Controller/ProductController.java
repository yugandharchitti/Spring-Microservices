package com.org.fossil.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.fossil.Model.Product;
import com.org.fossil.Services.ProductService;

@RestController

public class ProductController {

@Autowired	
private ProductService productService;	
	
@GetMapping("/fossil/product/all")
public List<Product> getProducts(){
	return productService.getAllProducts();
	
}

@GetMapping("/fossil/product/{productId}")
public Optional<Product> getProductById(@PathVariable(value ="productId") Long productId){
	return productService.getProductById(productId);
	
}
}


