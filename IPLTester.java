class IPLTester{
   public static void main(String a[]){
   IPLDTO ipl = new IPLDTO();
   ipl.setHost("TATA IPL");
   ipl.setNoofTeams(12);
   ipl.setOwner("BCCI");
   System.out.println(" Host   "+ipl.getHost()+"  no of teams  "+ipl.getNoofTeams()+"  owner of the ipl  "+ipl.getOwner());
   }
   }