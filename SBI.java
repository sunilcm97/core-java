class SBI extends Bank{
           @Override
            public void getIntrest(double intrest){
                  System.out.println("SBI Bank is");
                  intrest = intrest + 1.2;
                super.getIntrest(intrest);
			}
		}			
		
		
		
		
		
