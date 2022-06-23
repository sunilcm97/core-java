class Bunk{
static String bunkName="Indian OIL";
String oName;
String type;
int noOfWorkers;
long contactNo;
String loc;
public Bunk(){
	System.out.println("Object is Created");
}
public Bunk(String oName,String type,int noOfWorkers,long contactNo,String loc){
	this();
  this.oName=oName;
   this.type=type;
    this.noOfWorkers=noOfWorkers;
this.contactNo=contactNo;
this.loc=loc;
}
public static void main (String a[]){
Bunk bunk = new Bunk("Gajendra","Petrol",15,9663459862L,"RajajiNagar");
System.out.println("The Bunk Name is :"+Bunk.bunkName);
System.out.println(bunk.oName+"  "+bunk.type+"  "+bunk.noOfWorkers+"  "+bunk.contactNo+"  "+bunk.loc);
System.out.println("**********************************************************");

Bunk bunk1 = new Bunk("rajesh","Diesel",15,9741997473L,"Huskur Gate");
System.out.println("The Bunk Name is :"+Bunk.bunkName);
System.out.println(bunk1.oName+"  "+bunk1.type+"  "+bunk1.noOfWorkers+"  "+bunk1.contactNo+"  "+bunk1.loc);
}
}