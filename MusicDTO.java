   public class MusicDTO{

  public MusicDTO(){
   System.out.println("Music Object is Created");
    }
    private String musicType;
    private String musicName ;
	private double durationTime;
 
    public String getMusicType(){
	return musicType;
     }
    public void setMusicType(String musicType){
	this.musicType = musicType;
     }

     public String getMusicName(){
	return musicName;
     }
    public void setMusicName(String musicName){
	this.musicName = musicName;
     }
      
	 public double getDurationTime(){
	return durationTime;
     }
    public void setDurationTime(double durationTime){
	this.durationTime = durationTime;
     }
	 }








 
 