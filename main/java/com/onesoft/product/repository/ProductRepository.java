package com.onesoft.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value="select * from product_details where price = ?", nativeQuery = true)
	List<Product> getPrice(int p);

	

}
