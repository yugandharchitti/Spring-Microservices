package com.org.fossil.Daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.fossil.Model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> { 

}
