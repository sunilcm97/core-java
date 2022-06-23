class Institute{
static String instName="SITAR";
String course;
int noOfStaff;
long contactNo;
String loc;

public Institute(){
System.out.println("Object is created");
}

public Institute(String course,int noOfStaff,long contactNo,String loc){
	this();
    this.course=course;
    this.noOfStaff=noOfStaff;
    this.contactNo=contactNo;
    this.loc=loc;
}
public static void main (String a[]){
Institute institute = new Institute("Engineering",15,9663459862L,"Ramnagra");
System.out.println("The Institute Name is :"+Institute.instName);
System.out.println(institute.course+"  "+institute.noOfStaff+"  "+institute.contactNo+"  "+institute.loc);
System.out.println("**********************************************************");

Institute institute1 = new Institute("Agriculture",15,9741997473L,"Bangaluru");
System.out.println("The Institute Name is :"+institute.instName);
System.out.println(institute1.course+"  "+institute1.noOfStaff+"  "+institute1.contactNo+"  "+institute1.loc);
}
}