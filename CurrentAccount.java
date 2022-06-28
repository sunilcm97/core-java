class CurrentAccount extends BankAccount1{


    
	
	static int count;
	static int freeTransition = 4;
	double inte;
	double interestRate;
	
	public CurrentAccount(double inte, double interestRate) {
		this.inte = inte;
		this.interestRate = interestRate;
		
	}
	
	
	
	
	
	 public double deposit(double amt)
  
  {
   System.out.println("invoke Deposit()");
   System.out.println("Amount to be deposited "+ amt);
   System.out.println("Amount before deposit "+ amount);
   amount = amount + amt;
   System.out.println("The amount after deposit "+ amount);
   System.out.println("deposit method ended");
     count++;
   return amount;
  }
  
  public double withdraw(double withd)
  {
    System.out.println("invoke withdraw()");
	System.out.println(" amount to be withdraw "+ withd);
	System.out.println("the Amount before withdraw "+ amount);
	amount = amount - withd;
	System.out.println(" The Total Balance is "+ amount);
    System.out.println(" withdraw method ended ");
       count++;
   return amount;	
  }
  
  public void deductionOfFee() {
	  double transitionInte = 0;
	 
	  System.out.println("The deductionOfFee() started");
	  System.out.println("The total number of the count "+ count);
	  if(count > freeTransition) {
		  
		  transitionInte = inte * (count - freeTransition);
		 
		  withdraw(transitionInte);
		  
	  }
	   else {
		   getBalance();
	   }
	     System.out.println("The deductionOfFee() ended");
		  
		  
	  
  }
   
       public double periodicInterest() {
		   
		   
		    double interest = getBalance() * interestRate/100 ;
	   deposit(interest);
	   
	   return interest;
		   
	   }
  
 

}