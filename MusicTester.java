class MusicTester{
   public static void main(String a[]){
   Music ms = new Music();
   ms.setMusicType("Melody");
   ms.setMusicName("Evanu gelayanala");
   ms.setDurationTime(3.55d);
   System.out.println(ms.getMusicType()+" "+ms.getMusicName()+" "+ms.getDurationTime());
   }
   }