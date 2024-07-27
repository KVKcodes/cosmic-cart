package com.model;


import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Bean.Product;


@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class ProductModel implements ProductRemoter {

    @Override
    public String insertData(Product p) throws Exception {
    	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    	        EntityManager em = emf.createEntityManager();
    	        em.getTransaction().begin();
    	        em.persist(p);
    	        em.getTransaction().commit();
    	        em.close();
    	        emf.close();
    	        return "Record Inserted Successfully...";
	       
    }

	
}
