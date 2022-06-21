class Cosmetics{
   String name;
   String type;
   String address;
   long contactNo;
 String ownerName;
 int price;
 


 public static void main(String a[]){

//ClassName refVariable = new Classname();


Cosmetics cosmetic = new Cosmetics();
        cosmetic.name ="Baa akka Bhale Thago";
		cosmetic.type ="Kajal";
        cosmetic.address ="Magadi Road";
        cosmetic.contactNo =9663459862L;
        cosmetic.ownerName="sunil"; 
		cosmetic.price=300;
		
Cosmetics cosmetic1 = new Cosmetics();
        cosmetic1.name ="Hy Thangi Bale Etko";
		cosmetic1.type ="Foundation";
        cosmetic1.address ="Vijaynagar";
        cosmetic1.contactNo =9663459862L;
        cosmetic1.ownerName="sunil";
 		cosmetic1.price=600;
	
System.out.println("Name of The Sotre   :" + cosmetic.name);
System.out.println("Name of The cosmetic   :" + cosmetic.type);
System.out.println("Address of The Store  :" + cosmetic.address);
System.out.println("Contact No  :" + cosmetic.contactNo);
System.out.println("OwnerName of The Cosmetics  :" + cosmetic.ownerName);
System.out.println("Cosmetics Price   :" + cosmetic.price);
System.out.println("************************************************************************");

System.out.println("Name of The Sotre   :" + cosmetic1.name);
System.out.println("Name of The cosmetic   :" + cosmetic1.type);
System.out.println("Address of The Store  :" + cosmetic1.address);
System.out.println("Contact No  :" + cosmetic1.contactNo);
System.out.println("OwnerName of The Cosmetics  :" + cosmetic1.ownerName);
System.out.println("Cosmetics Price   :" + cosmetic1.price);
System.out.println("**************************************************************************");

}
}

