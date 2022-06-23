class Cosmetics{
  static String brand = "Nivia";
   String type;
   String address;
   long contactNo;
   int price;
   
   public Cosmetics(){
	   System.out.println("Object is Created");
   }
public Cosmetics(String type,String address,long contactNo,int price ){
         this();
   this.type = type;
   this.address = address;
   this.contactNo = contactNo;
    this.price = price;
}
	public static void main(String a[]){
		System.out.println("Cosmetic Brand is "+Cosmetics.brand);
		
		Cosmetics cos = new Cosmetics("perfum","BM Road",9663459862L,550);
		System.out.println(cos.type+"   "+cos.address+"  "+cos.contactNo+"  "+cos.price);
		
		 
		 Cosmetics cos1 = new Cosmetics("Powder","magdi Road",9768543257L,550);
		System.out.println(cos1.type+"   "+cos1.address+"  "+cos1.contactNo+"  "+cos1.price);
		
		
		
	}
}
		 
		 
		 
		 
		 
		 
       

