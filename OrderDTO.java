class OrderDTO {
	
	public OrderDTO(){
		System.out.println("OrderDTO() created");
	}
	
	private String orderName;
	private int id;
	private int price;
	private int orderQuantity;
	
	public String getOrderName(){
		return orderName;
	}
	public void setOrderName(String orderName){
		this.orderName = orderName;
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
	public int getOrderQuantity(){
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity){
		this.orderQuantity = orderQuantity;
	}
	
	public String toString(){
		return "Order Name :"+this.orderName+", "+"Order Id :"+this.id+", "+"Price :"+this.price+", "+"Order Quantity :"+this.orderQuantity ;
	}
}
Footer
