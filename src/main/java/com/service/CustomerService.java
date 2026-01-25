package com.service;

import java.util.Scanner;

import com.customerDAO.CustomerDAO;
import com.entity.CustomerDetails;

public class CustomerService {
	Scanner sc = new Scanner(System.in);
    CustomerDAO customerDAO=new CustomerDAO();
	public void insertCustomerDetais() {
		System.out.println("Enter the customer name:");
		String cName = sc.next();
		System.out.println("Enter the Email Id:");
		String cEmail = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();
		System.out.println("Enter the Mobile no:");
		long mobile = sc.nextLong();
		System.out.println("Enter the address:");
		String address = sc.next();
		System.out.println("Enter the gender:");
		String gender = sc.next();
	    CustomerDetails customerDetails=new CustomerDetails();
	    customerDetails.setCustomerName(cName);
	    customerDetails.setCustomerEmail(cEmail);
	    customerDetails.setcPassword(password);
	    customerDetails.setMobile(mobile);;
	    customerDetails.setAddress(address);
	    customerDetails.setGender(gender);
	    customerDAO.insertCustomerDetais(customerDetails);
	}
	public void updateCustomerEmailByUsingcustomerId()
	{
		System.out.println("Enter the Customer Id:");
		int cId=sc.nextInt();
		System.out.println("Enter the New Email Id:");
		String email=sc.next();
		customerDAO.updateCustomerEmailByUsingcustomerId(cId, email);
	}
	public void delecteTheCustomerDetailsByUsingCustomerId()
	{
		System.out.println("Enter the customer Id:");
		int cId=sc.nextInt();
		customerDAO.delecteTheCustomerDetailsByUsingCustomerId(cId);
	}
	public void selectCustomerDetailsByUsingCustomerId()
	{
		System.out.println("Enter the customer Id:");
		int cId=sc.nextInt();
		customerDAO.selectCustomerDetailsByUsingCustomerId(cId);
	}
	public void selectCustomerDetailsByUsingMobileNumber()
	{
		System.out.println("Enter the Customer mobile No:");
		long mobile=sc.nextLong();
		customerDAO.selectCustomerDetailsByUsingMobileNumber(mobile);
	}
	public void selectCustomerDetailsByUsingNameOrEmailOrGenderorAdderss()
	{
		System.out.println("Enter the Customer Name or Email Or Gender or Address :");
		String value=sc.next();
		customerDAO.selectCustomerDetailsByUsingNameOrEmailOrGenderorAdderss(value);
		
	}
}
