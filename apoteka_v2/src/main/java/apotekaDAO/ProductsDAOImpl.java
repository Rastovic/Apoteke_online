package apotekaDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import apotekaEntity.Products;
@Repository
public class ProductsDAOImpl implements ProductsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 
	
	@Transactional
	public List<Products> getProducts() {
		
		//get  session
		Session currentSession = sessionFactory.getCurrentSession();
		//create a query
		Query<Products> theQuery = 
				currentSession.createQuery(" from Products ",Products.class);
		//execute query and get result list
		List<Products> products =theQuery.getResultList();
		
		
		//return r
		return products;
	}

}
