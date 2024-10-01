package fastHibernate;

import java.util.Iterator;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import antlr.collections.List;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hiber");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction = entityManager.getTransaction();
//		Customer customer = new Customer();
//		Product p1 = new Product();
//		p1.setName("Aces");
//		p1.setPrice(3000);
//		eTransaction.begin();
//		entityManager.persist(customer);
//		entityManager.persist(p1);
//		eTransaction.commit();

//		Product product = entityManager.find(Product.class, 14);
//		eTransaction.begin();
//		entityManager.remove(product);
//		eTransaction.commit();

//		Product product = entityManager.find(Product.class, 6);
//		Customer customer = product.getCustomer();
//		customer.setName("Dhanapal");
//		product.setPrice(2400);
//		eTransaction.begin();
//		entityManager.merge(product);
//		eTransaction.commit();

//		Product product=entityManager.find(Product.class);
//		eTransaction.begin();
//		entityManager.remove(product);
//		eTransaction.commit();

		javax.persistence.Query query = entityManager.createQuery("select p from Product p");
		java.util.List<Product> prod = query.getResultList();
		for(Product p:prod) {
			System.out.println(p);
		}
	}
}
