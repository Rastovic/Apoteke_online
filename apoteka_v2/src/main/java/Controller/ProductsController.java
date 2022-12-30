package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import apotekaDAO.ProductsDAO;
import apotekaEntity.Products;


@Controller
@RequestMapping("/products")
public class ProductsController {
	
	
	//need to inject the product DAO
	@Autowired
	private ProductsDAO productsDAO;
	
	
	@GetMapping("/list")
	public String listProducts(Model theModel)
	{
		//GET PRODUCT FROM DAO
		List<Products> theProducts = productsDAO.getProducts();
		
		//ADD THE PRODUCT TO MODEL
		theModel.addAttribute("products", theProducts);
		
		return "list-products";
	}


}
