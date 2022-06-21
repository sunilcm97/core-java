class Industries{
static String indName="MYPOL";
String oName;
String indType;
int noOfWorkers;
long contactNo;
String indLoc;

public Industries(String ownerName,String iType,int noWorkers,long cNo,String iLoc){
oName=ownerName;
indType=iType;
noOfWorkers=noWorkers;
contactNo=cNo;
indLoc=iLoc;
}
public static void main (String a[]){
Industries industries = new Industries("CDN","Tube Industry",3000,9663459862L,"Krs road");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries.oName+"  "+industries.indType+"  "+industries.noOfWorkers+"  "+industries.contactNo+"  "+industries.indLoc);
System.out.println("**********************************************************");

Industries industries1 = new Industries("Srinivas","Tyre Industry",3000,9741997473L,"Krs road");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries1.oName+"  "+industries1.indType+"  "+industries1.noOfWorkers+"  "+industries1.contactNo+"  "+industries1.indLoc);
}

}