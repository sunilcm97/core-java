class ElectronicDeviceTester{
     public static void main(String a[]){
	   TubeLight1 ed = new TubeLight1();
	    ed. watt = "30W";
	ed. color = "Snow White";
	 ed. type = "Led";
	 ed. price = 150;
	ed.toGetLight();
	 
	 System.out.println(ed.watt+" "+ed.color+" "+ed.type+" "+ed.price);
	 }
}