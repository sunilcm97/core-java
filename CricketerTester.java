class CricketerTester{

public static void main(String a[])

{

Cricketer kohli = new Cricketer();
kohli.place = "delhi";
kohli.role = "Batsmen";
kohli.battingStyle = "Right handed";
kohli.debtYear = 2009;
kohli.getCricket();
System.out.println(kohli.place+" : "+kohli.role +" : "+kohli.battingStyle+" : "+kohli.debtYear);
}
}

