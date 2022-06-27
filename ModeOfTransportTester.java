class ModeOfTransportTester{
  public static void main(String a[]){
      
	  Bus bs = new Bus();
	bs. noOfPassenger = 60;
	bs. color = "Red";
	bs. type = "RoadWays";
	bs. price = 2000000;
	bs.usedForTransport();
	
	System.out.println(bs.noOfPassenger+" "+bs.color+" "+bs.type+" "+bs.price);
  }

}