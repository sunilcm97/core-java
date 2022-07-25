package com.xworkz.customer.crud.impl;


	
	import java.util.Arrays;
	import com.xworkz.customer.crud.Customer;
	import com.xworkz.customer.dto.OrderDTO;

	public class CustomerImpl implements Customer
	{
		
		OrderDTO orders[] ;
		
		int index;
		
		public CustomerImpl(int size)
		{
			orders = new OrderDTO[size];
			System.out.println("Customer constructor is created");
		}
			@Override
			public boolean creatOrder(OrderDTO order)
		{
			System.out.println("inside the creat  Order");
			boolean isAdded=false;
			
			if(order != null && order.getName() != null)
			{
				this.orders[index++]=order;
				isAdded=true;
			}
			else{
				System.out.println("required Order is not available..");
				}
			   return isAdded;
		}
		@Override
		public void getOrdersDetails()
		{
			System.out.println("inside the Order Details");
			for(int i=0; i<orders.length;i++)
			{
				System.out.println("order ID: "+orders[i].getId()+ " Name of the order: "+orders[i].getName()+" Address: "+orders[i].getAddress()+" Location: "+orders[i].getLocation()+"Contact No.:"+orders[i].getContactNo());
			}
		}
		@Override
		public boolean updateAddressByName(String name,String address)
			{
				System.out.println("inside the Update Address  By name");
				boolean updateAddress=false;
				for(int i=0;i<orders.length;i++)
				{
					if(orders[i].getName=name)
					{
						orders[i].setAddress(address);
						updateAddress=true;
					}
				}
					return updateAddress;
			 }
			 
		public boolean deleteOrderDetailsByName(String Name)
		{
			boolean orderDelete=false;
			System.out .println("inside Delete Order By name Method");
			int newIndex,oldIndex;
			for(newIndex=0,oldIndex=0;oldIndex<orders.length;oldIndex++)
			{
				if(!orders[oldIndex].getName().equals(Name))
				{
					orders[newIndex++]=orders[oldIndex];
					orderDelete=true;
				}
				
			}
			orders=Arrays.copyOf(orders.length);
			return orderDelete;
		}

}
