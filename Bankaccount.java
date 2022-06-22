class BankAccount{
static double amount;
public static void main(String a[]){
System.out.print("main method started");
deposit(6700.00);
deposit(12000);
withdraw(1000);
getTotalAmount();

deposit(5900.00);
deposit(1200);
withdraw(10000);
getTotalAmount();

deposit(700.00);
deposit(1000);
withdraw(100);
getTotalAmount();

deposit(6700.00);
deposit(12000);
withdraw(1000);
getTotalAmount();

deposit(6700.00);
deposit(12000);
withdraw(1000);
getTotalAmount();

deposit(6700.00);
deposit(12000);
withdraw(1000);
getTotalAmount();

deposit(6700.00);
deposit(12000);
withdraw(1000);
getTotalAmount();

System.out.println("main method ended");
}
static void deposit(double amt){
System.out.println("Invoked deposit()");
System.out.println("Amount to be deposit"+amt);
System.out.println("Amount before deposit"+amount);
amount =amount+ amt;
System.out.println("Amount after deposit"+amount);
System.out.println("end of deposite");
}
static void withdraw(double amt){
System.out.println("Invoked withdraw()");
System.out.println("Amount to be withdraw"+amt);
System.out.println("Amount before withdraw"+amount);
amount =amount- amt;
System.out.println("Amount after withdraw"+amount);
System.out.println("end of withdraw");
}
static void getTotalAmount()
{
	System.out.println("Total balance "+amount);
}
}
