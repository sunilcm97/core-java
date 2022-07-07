class MusicTester{
   public static void main(String a[]){
   MusicDTO ms = new MusicDTO();
   ms.setMusicType("Melody");
   ms.setMusicName("Evanu gelayanala");
   ms.setDurationTime(3.55d);
   System.out.println(ms.getMusicType()+" "+ms.getMusicName()+" "+ms.getDurationTime());
   }
   }