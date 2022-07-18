class FoodItemsDTO {
	
	public FoodItemsDTO(){
		System.out.println("FoodItemsDTO () created");
	}
	
	private String name;
	private int id;
	private int price;
	private String type;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}

	public String toString(){
		return "Food Name :"+this.name+", "+"Id :"+this.id+", "+"Price :"+this.price+", "+"Food Type :"+this.type+" " ;
	}
}

