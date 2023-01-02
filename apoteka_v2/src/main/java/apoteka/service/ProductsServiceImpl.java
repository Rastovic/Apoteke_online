package apoteka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import apoteka.dao.ProductsDAO;
import apoteka.entity.Products;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO productsDAO;
	
	
	@Override
	@Transactional
	public List<Products> getProducts() {
		
		return productsDAO.getProducts();
	}
	
	@Override
	@Transactional
	public Products getProducts(int theId) {
		
		return productsDAO.getProducts(theId);
	}

}
