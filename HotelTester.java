import java.util.Scanner;

class HotelTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Foods :");
		int size = sc.nextInt();
		
		Hotel hot = new Hotel(size);
		
		for(int i=0; i<size;i++){
		
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter id :");		
		int id = sc.nextInt();
		System.out.print("Enter Price :");
		int price = sc.nextInt();
		System.out.print("Enter type :");
		String type = sc.next();
		
		FoodItemsDTO dto = new FoodItemsDTO();
		dto.setName(name);
		dto.setId(id);
		dto.setPrice(price);
		dto.setType(type);
		
		hot.addingFoodItems(dto);
		}
		
		String option = null;
		do {
			System.out.println("Enter 1 to Fetch all Food Items");
			System.out.println("Enter 2 to update Food Price by Id");
			System.out.println("Enter 3 to update Food Price by type");
			System.out.println("Enter 4 to get Food Item by Id");
			System.out.println("Enter 5 to delete Food Items by Id");
			System.out.println("Enter 6 to delete Food Item by Name");
			System.out.println("Enter 7 to get All Food Names Available");
			System.out.print("Enter Choice :");
			
			int choice = sc.nextInt();
			switch(choice){
				
				case 1 : 	hot.getFoodItems();
							break;
							
				case 2 : 	System.out.print("Enter Existing Id :");
							int existingId = sc.nextInt();
							System.out.print("Enter Updated Price :");
							int updatedPrice = sc.nextInt();
							hot.updatePriceById(existingId, updatedPrice );
							break;
							
				case 3 :	System.out.print("Enter Existing Type :");
							String existingType = sc.next();
							System.out.print("Enter updated price:");
							int updatePrice = sc.nextInt();
							hot.updatePriceByType(existingType, updatePrice);
							break;
							
				case 4 :	System.out.print("Enter Existing Id :");
							int existId = sc.nextInt();
							hot.getFoodItemById(existId);
							break;
							
				case 5 : 	System.out.print("Enter existing Id :");
							int exstId = sc.nextInt();
							hot.deleteFoodItemById(exstId);
							break;
							
				case 6 :	System.out.print("Enter existing Name :");
							String existingName = sc.next();
							hot.deleteFoodItemsByName(existingName);
							break;
							
				case 7 :	hot.getAllFoodNames();
							break;
							
							
				default : 	System.out.println("Entered Choice cannot be delivered");
				
				
			}
		System.out.print("Do you want to continue y/n :");
		option = sc.next();
		}
		while(option.equals("y") );
		
	}
	
}

