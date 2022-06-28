class BankAccount1{
 double amount;

public double deposit(double amt){
System.out.println("Invoked deposit()");
System.out.println("Amount to be deposit"+amt);
System.out.println("Amount before deposit"+amount);
amount =amount+ amt;
System.out.println("Amount after deposit"+amount);
System.out.println("end of deposite");
System.out.println("********************************************");

return amount;
}
public double withdraw(double withdraw){
System.out.println("Invoked withdraw()");
System.out.println("Amount to be withdraw"+withdraw);
System.out.println("Amount before withdraw"+amount);
amount =amount- withdraw;
System.out.println("Amount after withdraw"+amount);
System.out.println("end of withdraw");
System.out.println("************************************************");

return amount;
}
public double getBalance()
{
	return amount;
}
public void transfer (double tAmount,BankAccount1 other){
	if(tAmount <= amount){
withdraw(tAmount);
other.deposit(tAmount);

}
else{
	System.out.print("The insifficient balance");
}
}	
}
