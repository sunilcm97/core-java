class AccountTester{
public static void main (String a[]){
SavingsAccount sa = new SavingsAccount(12.00);                         
sa.deposit(5000.00);
sa.withdraw(500.00);
sa.periodicInterest();

SavingsAccount other = new SavingsAccount(0.3);
sa.transfer(3000.00,other);

double totalAmount = other.periodicInterest();
	  System.out.println("Balance of other account "+ totalAmount);
	  System.out.println("=============================================");
	  
	  CurrentAccount ca = new CurrentAccount(20, 1.2);
	  ca.deposit(8000.00);
	  ca.withdraw(2800.00);
	  ca.deposit(10000.00);
	  ca.deposit(4000.00);
	  ca.withdraw(1000.00);
	  ca.deposit(2000.00);
	  ca.withdraw(10000.00);
	  ca.deductionOfFee();
	  ca.periodicInterest();
	  ca.getBalance();
}
}