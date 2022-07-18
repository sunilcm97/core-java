import java.util.Arrays;

class Hotel {
	
	//Hotel has many FoodItemsDTO(Arrays) to pick single item.
	FoodItemsDTO dtos[];
	
	//instance variable
	int index;
	
	public Hotel(int size){
		System.out.println("Hotel () created");
		dtos = new FoodItemsDTO[size];
	}
	
	public boolean addingFoodItems(FoodItemsDTO dto){
		System.out.println("addingFoodItems() created");
		boolean isAdded = false;		
		if(dtos!=null && dto.getName()!= null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Food Items Added succesfully");
		}
		else{
			System.out.println("Food Items not found");
		}
		return isAdded;
	}
	
	public void getFoodItems(){
		System.out.println("Food Items Available are :");
		
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i]);
		}
	}
	
	public boolean updatePriceById(int id, int price){
		boolean updatedPrice=false;
		System.out.println("updatePriceById() invoked");
		for(int i=0;i<dtos.length; i++){
			if(dtos[i].getId()==id ){
				dtos[i].setPrice(price);
				updatedPrice=true;
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}		
		return updatedPrice;
	}
	
	public boolean updatePriceByType(String type, int price){
		boolean updatePrice=false;
		System.out.println("updatePriceType() invoked");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getType().equals(type) ){
				dtos[i].setPrice(price);
				updatePrice = true;
			}
			else {
				System.out.println("Entered type does not exists");
			}
		}		
		return updatePrice;
	}
	
	public FoodItemsDTO getFoodItemById(int id){
		FoodItemsDTO foodItem = null;
		System.out.println("getFoodItemById() invoked");
		for(int i=0;i<dtos.length;i++){
			if (dtos[i].getId() == id ){
				foodItem = dtos[i];
				System.out.println(foodItem);
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		return foodItem;
	}
	
	public boolean deleteFoodItemById(int id){
		boolean deleteFoodItem = false;
		int i,j=0;
		for(i=0,j=0;j<dtos.length;j++){
			if(dtos[j].getId()!=id ){
			dtos[i++]=dtos[j];
			System.out.println("Food Item deleted Successfully");
			deleteFoodItem = true;
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		dtos = Arrays.copyOf(dtos,i);		
		return deleteFoodItem;
	}
	public boolean deleteFoodItemsByName(String name){
		boolean deletedFoodItem = false;
		int i,j=0;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[i].getName().equals(name) ){
				dtos[i++]=dtos[j];
				System.out.println("Food Item deleted Successfully");
				deletedFoodItem = true;
			}
			else {
				System.out.println("Entered Name does not found");
			}
		}
		dtos = Arrays.copyOf(dtos,i);
		return deletedFoodItem;
	}
	
	public String getAllFoodNames(){
		String foodNames = null;
		System.out.println("getAllFoodNames() invoked");
		for(int i=0;i<dtos.length;i++){
		foodNames = dtos[i].getName() ;
		System.out.println(foodNames);
		}
		
		return foodNames;		
	}
	
	
}
Footer
