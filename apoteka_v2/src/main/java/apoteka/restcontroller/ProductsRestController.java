package apoteka.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apoteka.entity.Products;
import apoteka.service.ProductsService;

@RestController
@RequestMapping("/api")
public class ProductsRestController {
	
	@Autowired
	private ProductsService productsService;
	
	
	@GetMapping("/products")
	public List<Products> getProducts(){
		return productsService.getProducts();
	}
	
	@GetMapping("/products/{productID}")
	public Products getProducts(@PathVariable int productID) {
	Products theProducts = productsService.getProducts(productID);
	return theProducts;
	}
	
}
