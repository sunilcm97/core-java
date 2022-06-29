		
		class Seetha extends Bank{
			@Override
			 public void getIntrest(double intrest){
				 System.out.println("Setha Bank is");
				 intrest = intrest + 1.2;
				 super.getIntrest(intrest);
			 }
		}
			