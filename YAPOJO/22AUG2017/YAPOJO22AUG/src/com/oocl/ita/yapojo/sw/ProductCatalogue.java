package com.oocl.ita.yapojo.sw;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.oocl.ita.yapo.day17.webservice.business.ProductServiceImple;

@WebService
public class ProductCatalogue {
	
	ProductServiceImple  productService = new ProductServiceImple();

	@WebMethod
	public List<String> getProductCategories() {
		return productService.getProductCategories();
//		List<String> categories = new ArrayList<>();
//		categories.add("Books");
//		categories.add("Music");
//		categories.add("Movies");
//		categories.add("FastFood");
//		return categories;
	}
	  public List<String> gegProducts(String category){
		  return productService.getProducts(category);
	  }
}
