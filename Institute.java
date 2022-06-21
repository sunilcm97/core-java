class Institute{
static String instName="SITAR";
String course;
int noOfStaff;
long contactNo;
String loc;

public Institute(String iCourse,int Staff,long cNo,String iLoc){
course=iCourse;
noOfStaff=Staff;
contactNo=cNo;
loc=iLoc;
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