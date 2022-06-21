class Mobile
{
 String name;
 String address;
 long contactNo;
 String ownerName;
 

 public static void main(String a[]){

//ClassName refVariable = new Classname();


        Mobile mobile = new Mobile();
        mobile.name ="Chamundeshwari Electricals";
        mobile.address ="Magadi Road";
        mobile.contactNo =9663459862L;
        mobile.ownerName="sunil";
		

        Mobile mobile1 = new Mobile();
        mobile1.name ="Manjunatha Electricals";
        mobile1.address ="Magadi Road";
        mobile1.contactNo =9663459862L;
        mobile1.ownerName="sunil";

 
System.out.println("Name of The Mobiles   :" + mobile.name);
System.out.println("Address of The Mobile Factory :" + mobile.address);
System.out.println("Contact No  :" + mobile.contactNo);
System.out.println("OwnerName of The Mobile  :" + mobile.ownerName);
System.out.println("************************************************************");


System.out.println("Name of The Mobiles   :" + mobile1.name);
System.out.println("Address of The Mobile Factory :" + mobile1.address);
System.out.println("Contact No  :" + mobile1.contactNo);
System.out.println("OwnerName of The Mobile  :" + mobile1.ownerName);
System.out.println("************************************************************");


}
}
