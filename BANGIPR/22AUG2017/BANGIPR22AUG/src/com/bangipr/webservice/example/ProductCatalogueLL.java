package com.bangipr.webservice.example;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bangipr.webbusiness.example.ProductServiceImp;

@WebService
public class ProductCatalogueLL {
	
	ProductServiceImp productService = new ProductServiceImp();
	
	
	@WebMethod
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		categories.add("FastFood");
		
		return categories;
		
	}
	
	

}
