class Games{

   private String name;
   private int noOfPlayers;
   private int points;
   
   public String getName(){
    return name;
	}
	public int getPlayers(){
	return noOfPlayers;
	}
	public int getPoints(){
	return points;
	}
	public void setName(String name){
	this.name = name;
	}
	public void setPlayers(int noOfPlayers){
	this.noOfPlayers=noOfPlayers;
	}
	public void setPoints(int points){
	this.points=points;
	}
	}