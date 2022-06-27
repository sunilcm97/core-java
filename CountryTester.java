class CountryTester{

public static void main(String a[])
{

Country count = new Country();

count.capital = "India";
count.noOfStates = 28;
count.population = "138 crores";
count.currency= "Rupee";
count.getInformation();
System.out.println(count.capital+" : "+count.noOfStates+" : "+count.population+" : "+count.currency);

}
}