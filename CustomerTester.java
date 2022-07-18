import java.util.Scanner;

class CustomerTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Orders :");
		int size = sc.nextInt();
		
		Customer cus = new Customer(size);
		
		for(int i=0;i<size;i++){
			System.out.print("Enter Order Name :");
			String orderName = sc.next();
			System.out.print("Enter id :");
			int id = sc.nextInt();
			System.out.print("Enter Price :");
			int price = sc.nextInt();
			System.out.print("Enter Quantity :");
			int quantity = sc.nextInt();
					
			OrderDTO dto = new OrderDTO();
			dto.setOrderName(orderName);
			dto.setId(id);
			dto.setPrice(price);
			dto.setOrderQuantity(quantity);
		
			cus.orderToBePlaced(dto);
		
		}
		String option = null;
		
		do {
			System.out.println("Enter 1 to Fetch All Orders");
			System.out.println("Enter 2 to update Order Price by Order Id");
			System.out.println("Enter 3 to update Order price by order Name");
			System.out.println("Enter 4 to get Order Name by Order Id");
			System.out.println("Enter 5 to get OrderDetails by Order Id");
			System.out.println("Enter 6 to delete order by Id");
			System.out.println("Enter 7 to delete order by Name");
			System.out.println("Enter 8 to get order Quantity");
			System.out.print("Enter Choice :");
			
			int choice = sc.nextInt();
			switch(choice){
				case 1 :	cus.getOrderDetails();
							break;
				
				case 2 :	System.out.print("Enter existing Id : ");
							int existingId = sc.nextInt();
							System.out.print("Enter updated Price : ");
							int updatedPrice = sc.nextInt();
							cus.updatePriceById(existingId, updatedPrice);
							break;
					
				case 3 :	System.out.print("Enter existing name : ");
							String existName = sc.next();
							System.out.print("Enter updated Price : ");
							int updatePrice = sc.nextInt();
							cus.updatePriceByName(existName, updatePrice);
							break;
							
				case 4 :	System.out.print("Enter existing Id :");
							int existsId = sc.nextInt();
							cus.getOrderNameById(existsId);
							break;
							
				case 5 :	System.out.print("Enter existing Id :");
							int exisId = sc.nextInt();
							cus.getOrderDetailsById(exisId);
							break;
				
							
				case 6 :	System.out.print("Enter Id to be deleted : ");
							int existId = sc.nextInt();
							cus.deletedOrderById(existId);
							break;
							
				case 7 :	System.out.print("Enter Name to be deleted : ");
							String existname = sc.next();
							cus.deletedOrderByName(existname);
							break;
							
				case 8 :	cus.getOrderQuantity();
							break;
						
				default : System.out.println("Entered choice cannot be processed ");			
			
			}			
			System.out.print("Do you want to continue y/n :");
			option = sc.next();
		}
		while(option.equals("y") );	
	}
	
	
}

