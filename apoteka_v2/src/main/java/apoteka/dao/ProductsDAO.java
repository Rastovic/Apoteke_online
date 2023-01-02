package apoteka.dao;

import java.util.List;

import apoteka.entity.Products;

public interface ProductsDAO {
	
	public List<Products>getProducts();
	
	public Products getProducts(int theId);

}
