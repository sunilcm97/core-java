class Bar{
   String name;
   String address;
   long contactNo;
 String ownerName;
 

 public static void main(String a[]){

//ClassName refVariable = new Classname();


Bar bar = new Bar();
        bar.name ="Chamundeshwari Bar";
        bar.address ="Magadi Road";
        bar.contactNo =9663459862L;
        bar.ownerName="sunil"; 
		
		
		Bar bar1 = new Bar();
        bar1.name ="Anapurneshwari Bar";
        bar1.address ="Magadi Road";
        bar1.contactNo =9663459862L;
        bar1.ownerName="sunil"; 
			
 
System.out.println("Name of The Bar   :" + bar.name);
System.out.println("Address of The Bar :" + bar.address);
System.out.println("Contact No  :" + bar.contactNo);
System.out.println("OwnerName of The Bar  :" + bar.ownerName);
System.out.println("**********************************************************");



System.out.println("Name of The Bar   :" + bar1.name);
System.out.println("Address of The Bar :" + bar1.address);
System.out.println("Contact No  :" + bar1.contactNo);
System.out.println("OwnerName of The Bar  :" + bar1.ownerName);
System.out.println("**************************************************************");
}
}
