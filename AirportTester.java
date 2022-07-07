class AirportTester{
   public static void main(String a[]){
   AirportDTO air = new AirportDTO();
   air.setName("Devanahalli");
   air.setContactNo(9663459862L);
   air.setId(007);
   System.out.println(air.getName()+" "+air.getContactNo()+" "+air.getId());
   }
   }