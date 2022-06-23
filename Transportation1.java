class Transportation1{
	String transType;
	int noOfSeats;
	static String startingPoint ="Mysore"; 
	static String endingPoint ="Banglore"; 
	public Transportation1(){
	System.out.println("Object is Creatred");
	}
	
	public Transportation1(String transType,int noOfSeats){
	     this();
		this.transType =transType;
		this.noOfSeats =noOfSeats;
	}
	public static void main (String a[]){
		Transportation1 trans = new Transportation1("Metro",90);
		System.out.println(trans.transType+"  No oF Seats "+trans.noOfSeats);
		System.out.println(Transportation1.startingPoint+" to "+Transportation1.endingPoint);
}
} 