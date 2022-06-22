class BookMyMovieTester{

	String movies[] = {"Om","Gaalipata","A","Upendra","H2O","Raktha Kanneeru","Suryavamshi","Yajamana"};
	public static void main(String a[]){
		
		
BookMyMovie bookMyShow = new BookMyMovie("Prasana",10,"Om","Kurkure",5,55);
System.out.println("Theatre name is "+bookMyShow.theatreName);
System.out.println("snacks  name is "+bookMyShow.snackName);

bookMyShow.showTime(10,"Devva","Om");
bookMyShow.buySnacks("Kurkure",5,55);
bookMyShow.showTime(20,"sunil","A");
bookMyShow.buySnacks("Popcorn",8,115);
}
}