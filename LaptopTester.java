class LaptopTester{

  public static void main(String s[]){
     Lenovo len = new Lenovo();
	 len.price = 45000;
	 len.ramStorage = "8 GB";
	 len.modelName = "X515JA-BQ302W";
	 len.processorName = "Intel";
	 len.operatingSystem = "Windows 10";
	 
	 System.out.println(len.price+ "  " +len.ramStorage+ "  " +len.modelName+ "  " +len.processorName+ "  " +len.operatingSystem);
  }
}