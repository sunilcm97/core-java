class Canara extends Bank{
			@Override
			public void getIntrest(double intrest){
				System.out.println("Canara Bank is");
				intrest = intrest + 1.5;
				super.getIntrest(intrest);
			}
		}
		
		
		
		
		
		