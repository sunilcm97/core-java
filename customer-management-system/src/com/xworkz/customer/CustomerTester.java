package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.crud.impl.CustomerImpl;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Orders added ");
		int size = sc.nextInt();
		
		Customer cu = new CustomerImpl(size);
		for(int i=0; i<size; i++)
		{
			OrderDTO od = new OrderDTO();
			
			System.out.println("Enter the ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter  Name of the Order ");
			String name = sc.next();
			
			System.out.println("Enter the address: ");
			String address = sc.next();
			
			
			System.out.println("Enter the location: ");
			String location = sc.next();
			
			System.out.println("Enter the Contact no.: ");
			long contactNo = sc.nextLong();
			
			od.setId(id);
			od.setName(name);
			od.setAddress(address);
			od.setLocation(location);
			od.setContactNo(contactNo);
			
			cu.creatOrder(od);
		}
				
				String option = null;
			do{
						System.out.println("Enter 1 to the Fetch All the orderDTO Details");
						System.out.println("Enter 2 to update Address By Name ");
						System.out.println("Enter 3 to delete Order Details By Name");
						System.out.println("Enter 4 to get Order by Name");
						System.out.println("enter the Choise No.");
						
						int choise= sc.nextInt();
				switch(choise) 
					{
						case 1 : cu.getOrdersDetails();
									break;
						case 2 : 
								System.out.println("Enter the Exsting name");
								String exstingName=sc.next();
								
								System.out.println("enter the updateAddress By Name");
								String updateAddress=sc.next();
								cu.updateAddressByName(exstingName,updateAddress);
									break;
						case 3 : System.out.println("enter the name to be deleted");
									String name1 = sc.next();
								cu.deleteOrderDetailsByName( name1);
						
									break;
						case 4 : 
									break;
						default : break;
					}
					System.out.println("do you want to continuee..y/n");
					option = sc.next();
						
					
				}
			while(option.equals("y"));
				
				
				
	}
	}


