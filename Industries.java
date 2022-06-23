class Industries{
static String indName="MYPOL";
String oName;
String indType;
int noOfWorkers;
long contactNo;
String location;
public Industries(){
	System.out.println("Object is Created");
	
}

public Industries(String oName,String indType,int noOfWorkers,long contactNo,String location){
	this();
   this.oName=oName;
   this.indType=indType;
   this.noOfWorkers=noOfWorkers;
   this.contactNo=contactNo;
   this.location=location;
}
public static void main (String a[]){
Industries industries = new Industries("CDN","Tube Industry",3000,9663459862L,"Krs road");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries.oName+"  "+industries.indType+"  "+industries.noOfWorkers+"  "+industries.contactNo+"  "+industries.location);
System.out.println("**********************************************************");

Industries industries1 = new Industries("Srinivas","Tyre Industry",3000,9741997473L,"Krs road");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries1.oName+"  "+industries1.indType+"  "+industries1.noOfWorkers+"  "+industries1.contactNo+"  "+industries1.location);
}

}