class Airconditioner{
static String brand="LG";
static double price=27600.0;
static String color="pink";
static boolean isConnected;
static int minTemperature;
static int currentTemperature;
static int maxTemperature=5;

public static void OnOrOff(){
System.out.println("OnOrOff");
if(isConnected == false){
isConnected = true;
System.out.println("Airconditioner is turned Onn... ");
System.out.println("The Airconditioner Brand is "+brand);
System.out.println("The Airconditioner price is "+price);
System.out.println("The Airconditioner color is "+color);
}
else if(isConnected == true){
isConnected = false;
System.out.println("Airconditioner is turned off ");
}
}
public static void main(String a[]){
OnOrOff();
    increaseTemperature();
 	increaseTemperature();
	increaseTemperature();
	increaseTemperature();
	increaseTemperature();
	increaseTemperature();
	decreaseTemperature();
	decreaseTemperature();
	decreaseTemperature();
	decreaseTemperature();
	decreaseTemperature();
	decreaseTemperature();
}
public static void increaseTemperature(){
	System.out.println("increaseTemperature() started");
	if(isConnected == true){
	System.out.println("Airconditioner is turned on");
	if(currentTemperature < maxTemperature){
	currentTemperature = currentTemperature + 1;
	System.out.println("The Current Temperature is "+currentTemperature);
	}
	else{
		System.out.println("Max Temperature Reached");
	}
}

else{
	System.out.println("Switch On The Airconditioner");
}
System.out.println("increaseTemperature() ended");
}
public static void decreaseTemperature(){
	System.out.println("decreaseTemperature() started");
if(isConnected == true){
	System.out.println("Airconditioner is turned on");
	if(currentTemperature > minTemperature){
	currentTemperature = currentTemperature - 1;
	System.out.println("The Current Temperature is "+currentTemperature);
	}
	else{
		System.out.println("Min Temperature Reached");
	}
}

else{
	System.out.println("Switch On The Airconditioner");
}
System.out.println("decreaseTemperature() ended");
}
}