package com;

import java.util.Scanner;

import com.service.CustomerService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService customerService = new CustomerService();
		System.out.println("Enter\n1.Customer Registration" + "\n2.UpdateTheCustomerEmailByUsingCustomerId"
				+ "\n3.Delete customerDetails By Using customerId" + "\n4.Select customer Details By Using Custome Id"
				+ "\n5.select Customet Details Customer Mobile Number"
				+ "\n6.select Custoner Details By using Address or Email or gender or name");

		switch (sc.nextInt()) {
		case 1:
			customerService.insertCustomerDetais();
			break;
		case 2:
			customerService.updateCustomerEmailByUsingcustomerId();
			break;
		case 3:
			customerService.delecteTheCustomerDetailsByUsingCustomerId();
			break;
		case 4:
			customerService.selectCustomerDetailsByUsingCustomerId();
			break;
		case 5:
			customerService.selectCustomerDetailsByUsingMobileNumber();
			break;
		case 6:
			customerService.selectCustomerDetailsByUsingNameOrEmailOrGenderorAdderss();
			break;
		default:
			System.out.println("Invalid option");
		}
		sc.close();
	}
}
