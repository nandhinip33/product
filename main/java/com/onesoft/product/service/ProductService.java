package com.onesoft.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.product.dao.ProductDao;
import com.onesoft.product.entity.Product;

@Service

public class ProductService {
	@Autowired
	ProductDao pd;
	
	public String setPost1(Product p) {
		return pd.setPost1(p);
	}

	public String setPost2(List <Product> p) {
		return pd.setPost2(p);
	}

	public String setUpdate(Product p) {
		return pd.setUpdate(p);
	}

	public Product getData(int id) {
		return pd.getData(id);
	}

	public List<Product> getData2() {
		return pd.getData2();
	}

	public String getDelete(int id) {
		return pd.getDelete(id);
	}

	public List<Product> getAll() {
		return pd.getAll();
	}

	public List<Product> setprice(int p) throws PriceNotFound {
		List <Product> pr = pd.getPrice(p);
		if(pr.isEmpty()) {
			throw new PriceNotFound("Invalid data");
		}
		else {
		return pr;
		}
	}

	
	

}
