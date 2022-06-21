class ShowRoom1{
int id ;
static String name="WoodLand";
static int noOfBranches =56;
long contactNo ;
String location ;

public ShowRoom1 (int id,long contactNo,String location){
id = this.id;
contactNo = this.contactNo;
location  = this.location;

}
public static void main(String a[]){

ShowRoom1 show =new ShowRoom1(1,9663459862L,"Jaynagara");
System.out.println("ShowRoom Name "+ShowRoom1.name);
System.out.println("No of Branches " + ShowRoom1.noOfBranches);
System.out.println(show.id + " "+show.contactNo+" "+show.location +"\n");


ShowRoom1 show1 =new ShowRoom1(4,9741997473L,"Vijayanagra");
System.out.println("2nd ShowRoom id:" + show1.id +"\n"+ "Showroom Contact No :"+ show1.contactNo+ "\n"+"ShowRoom Location :"+show1.location);
System.out.println("ShowRoom Name "+ShowRoom1.name);
System.out.println("No of Branches " + ShowRoom1.noOfBranches);
//System.out.println(show.showRoomId + " "+show.contactNo+" "+show.location +"\n");
}
}
