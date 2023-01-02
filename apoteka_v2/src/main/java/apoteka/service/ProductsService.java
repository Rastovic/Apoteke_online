package apoteka.service;

import java.util.List;

import apoteka.entity.Products;

public interface ProductsService {
	public List<Products> getProducts();
	public Products getProducts(int theId);
}
