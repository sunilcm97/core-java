class BookMyMovie{
String movies[] = {"Om","Gaalipata","A","Upendra","H2O","Raktha Kanneeru","Suryavamshi","Yajamana"};
int noOfTickets;
static int ticketPrice = 600;
String theatreName;
String movieName;
int  totalNoofTickets;
int totalTicketPrice;

String snacks[] = {"Chips","Kurkure","Popcorn","CoolDrinks","SweetCorn"};
static int snackPrice =150;
String snackName;
int quantity ;
int seatNo;
int totalnoOfSnacks ;
int totalSnacks;


public BookMyMovie(String theatreName, int noOfTickets,String movieName,String snackName,int quantity,int seatNo){
System.out.println("BookMyMovie Object is created");
this.theatreName =theatreName;
this.noOfTickets =noOfTickets;
this.movieName = movieName;

this.snackName = snackName;
this.quantity = quantity;
this.seatNo = seatNo;

}

public int  showTime(int noOfTickets,String bookedBy,String movieName){
int totalTicketPrice = 0;
System.out.println("Inside showTime().........");
System.out.println("Arg 1 : No of Tickets  "+noOfTickets);
System.out.println("Arg 2 :  Booked By  "+bookedBy);
System.out.println("Arg 3 : Movie Name  "+movieName);

for (int i= 0; i<movies.length; i++){


 if(movieName == movies[i]){
 System.out.println("Movie name matched");
 
 if(noOfTickets < totalNoofTickets){
 totalTicketPrice = noOfTickets*ticketPrice;
 totalNoofTickets = totalNoofTickets - noOfTickets;
 System.out.println("For movie :" + movieName +"No of Tickets are That are remaining : "+ totalNoofTickets+"Total price is :"+totalTicketPrice);
 
 }
 else{
 System.out.println("Isht Ticket Illa.....");
 }
 }
 else{
 System.out.println("Movie Not available");
 }
 }
 return totalTicketPrice;
 }
public int buySnacks (String snacksName , int quantity ,int bookedSeatNo ){
	int totalSnackprice =0;
	System.out.println("Arg 1 : Name of the Snack "+snackName);
System.out.println("Arg 2 :  Quantity of Snack  "+quantity);
System.out.println("Arg 3 : booked By seat No  "+bookedSeatNo);

for (int i=0; i<snacks.length ;i++){
	if(snackName==snacks[i])
	{
System.out.println("The Snack Name is Matched");

if(quantity<totalnoOfSnacks){
	totalSnackprice = quantity * snackPrice;
	totalnoOfSnacks = totalnoOfSnacks - quantity;
	System.out.println("For snacks : "+ quantity + "snacks remaining "+ totalnoOfSnacks +" total price is " + totalTicketPrice);
}
else{
	System.out.println("Kelavu snacks ella kalli agidave.......");
}
	}
	else{
		System.out.println("snack is not Available");
	}
}
return totalSnackprice;
}
}
	 
