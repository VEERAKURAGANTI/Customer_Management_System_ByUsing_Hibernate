package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@Column(name="customer_name",nullable = false)
	private String customerName;
	@Column(name="cust_email",unique = true,nullable = false)
	private  String customerEmail;
	@Column(name= "password",nullable = false)
	private String cPassword;
	@Column(name="cust_mobile",unique = true,nullable = false)
	private long mobile;
	@Column(name="address",nullable = false)
	private String address;
	@Column(name ="gender",nullable = false)
	private String gender;
public CustomerDetails()
{}
	
public CustomerDetails(int customerId, String customerName, String customerEmail, String cPassword, long mobile,
		String address, String gender) {
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.cPassword = cPassword;
	this.mobile = mobile;
	this.address = address;
	this.gender = gender;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getcPassword() {
	return cPassword;
}
public void setcPassword(String cPassword) {
	this.cPassword = cPassword;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


}
