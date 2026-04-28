package com.customerDAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.CustomerDetails;
public class CustomerDAO {
	
	public void insertCustomerDetais(CustomerDetails customerDetails)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(customerDetails);
		System.out.println("Data inserted");
		entityTransaction.commit();
	}
	public void updateCustomerEmailByUsingcustomerId(int cId,String email)
	{
		String update="update CustomerDetails cust set cust.customerEmail=:emailId where cust.customerId=:cId";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(update);
		query.setParameter("emailId", email);
		query.setParameter("cId", cId);
		int res=query.executeUpdate();
		if(res!=0)
		{
			System.out.println("Email Updated");
		}
		else {
			System.out.println("No data found");
		}
		entityTransaction.commit();
	}
	public void delecteTheCustomerDetailsByUsingCustomerId(int cId)
	{
		String delete="delete from CustomerDetails cust where cust.customerId=:cId ";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(delete);
		query.setParameter("cId", cId);
		int res=query.executeUpdate();
		if(res!=0)
		{
			System.out.println("Customer Details deleted");
		}
		else {
			System.out.println("No data found");
		}
		entityTransaction.commit();
	}
	public void selectCustomerDetailsByUsingCustomerId(int cId)
	{
		String select ="select cust from CustomerDetails cust where cust.customerId=:cId";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
		query.setParameter("cId", cId);
		try {
			CustomerDetails customerDetails= (CustomerDetails)query.getSingleResult();
			System.out.println("Customer Id     :"+customerDetails.getCustomerId());
			System.out.println("Customer Name   :"+customerDetails.getCustomerName());
			System.out.println("Customer email  :"+customerDetails.getCustomerEmail());
			System.out.println("Customer Mobile :"+customerDetails.getMobile());
			System.out.println("Customer gender :"+customerDetails.getGender());
			System.out.println("Customer Address:"+customerDetails.getAddress());
		} catch (Exception e) {
			System.out.println("No data Found");
		}
	}
	public void selectCustomerDetailsByUsingMobileNumber(long mobile)
	{
		String select="select cust from CustomerDetails cust where cust.mobile=:mob";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
		query.setParameter("mob", mobile);
		try {
			CustomerDetails customerDetails= (CustomerDetails)query.getSingleResult();
			System.out.println("Customer Id     :"+customerDetails.getCustomerId());
			System.out.println("Customer Name   :"+customerDetails.getCustomerName());
			System.out.println("Customer email  :"+customerDetails.getCustomerEmail());
			System.out.println("Customer Mobile :"+customerDetails.getMobile());
			System.out.println("Customer gender :"+customerDetails.getGender());
			System.out.println("Customer Address:"+customerDetails.getAddress());
		} catch (Exception e) {
			System.out.println("No data Found");
		}
	}
	public void selectCustomerDetailsByUsingNameOrEmailOrGenderorAdderss(String value)
	{
		String select="select cust from CustomerDetails cust where cust.customerName=:name or cust.customerEmail=:email or cust.gender=:gender or cust.address=:address";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CustomeManagementSystem_ByUsing_Hibernate");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
		query.setParameter("name", value);
		query.setParameter("email", value);
		query.setParameter("gender", value);
		query.setParameter("address", value);
		List<CustomerDetails>list=query.getResultList();
		for(CustomerDetails customerDetails:list)
		{
			System.out.println("Customer Id     :"+customerDetails.getCustomerId());
			System.out.println("Customer Name   :"+customerDetails.getCustomerName());
			System.out.println("Customer email  :"+customerDetails.getCustomerEmail());
			System.out.println("Customer Mobile :"+customerDetails.getMobile());
			System.out.println("Customer gender :"+customerDetails.getGender());
			System.out.println("Customer Address:"+customerDetails.getAddress());
			System.out.println("---------------------------------------------------");
		}
	}
}
