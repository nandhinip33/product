package com.onesoft.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.product.entity.Product;
import com.onesoft.product.repository.ProductRepository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;
	
	public String setPost1(Product p) {
		pr.save(p);
		return "Posted";
	}
	
	public String setPost2(List <Product> p) {
		pr.saveAll(p);
		return "Posted";
	}
	
	public String setUpdate(Product p) {
		pr.save(p);
		return "Updated";
	}

	public Product getData(int id) {
		return pr.findById(id).get();
	}

	public List<Product> getData2() {
		return pr.findAll();
	}

	public String getDelete(int id) {
		pr.deleteById(id);
		return "Deleted";
	}

	public List<Product> getAll() {
		return pr.findAll();
	}

	public List<Product> getPrice(int p) {
		return pr.getPrice(p);
	}
	

}
