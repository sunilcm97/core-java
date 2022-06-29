class Kotak extends Bank{
			 @Override 
			 public void getIntrest(double intrest){
				 System.out.println("Kotak bank is");
				 intrest = intrest + 1.7;
				 super.getIntrest(intrest);
			 }
		}
		
		
		
		
		
		