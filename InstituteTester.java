class InstituteTester{
   public static void main(String a[]){
      
	  Xworkz xw = new Xworkz();
	  xw.location =  "Rajajinagar";
	  xw.noOfTrainees = 100;
	xw.noOfTrainers = 20;
	xw.noOfBranches = 2;
    xw.letLearn();
	
	System.out.println(xw.location+" "+xw.noOfTrainees+" "+xw.noOfTrainers+" "+xw.noOfBranches);
   }
}