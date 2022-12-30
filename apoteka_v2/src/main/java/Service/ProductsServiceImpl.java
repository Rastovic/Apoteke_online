package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apotekaDAO.ProductsDAO;
import apotekaEntity.Products;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO productsDAO;
	
	
	@Override
	public List<Products> getCustomers() {
		
		return productsDAO.getProducts();
	}

}
