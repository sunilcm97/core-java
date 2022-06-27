class EngineerTester{
public static void main(String a[]){

CivilEngg civil = new CivilEngg();
civil.problemSolving();
System.out.println("===================================");


CsEngg cs = new CsEngg();
cs.problemSolving();
System.out.println("===================================");

EcEngg ec = new EcEngg();
ec.problemSolving();
System.out.println("===================================");


MechanicalEngg mech = new MechanicalEngg();
mech.problemSolving();
System.out.println("===================================");

IsEngg is = new IsEngg();
is.problemSolving();
System.out.println("===================================");

}
}