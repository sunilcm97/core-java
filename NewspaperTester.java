class NewspaperTester{
   public static void main(String a[]){
   Newspaper np = new Newspaper();
   np.setName("Hindhu");
   np.setNoofPages(12);
   np.setPrice(3.00d);
   System.out.println(np.getName()+" "+np.getNoofPages()+" "+np.getPrice());
   }
   }