class NovelTester{
   public static void main(String a[]){
   NovelDTO nov = new NovelDTO();
   nov.setName("Malenada Chithragalu");
   nov.setPublicationName("Mysore Publication");
   nov.setPrice(435);
   System.out.println(nov.getName()+" "+nov.getPublicationName()+" "+nov.getPrice());
   }
   }