class BankTester{

public static void main(String a[])
{
Bank bk = new Bank();
bk.typeOfBank = "Private";
bk.foundedYear = 1987;
bk.noOfEmployee = 24356;
bk.Bank();
System.out.println(bk.typeOfBank+" : "+bk.foundedYear+" : "+bk.noOfEmployee);

}
}