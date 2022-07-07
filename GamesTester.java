public class GamesTester{
    
	public static void main(String a[]){
	
	GamesDTO game = new GamesDTO();
	
	game.setName("volleyball");
	game.setPlayers(12);
	game.setPoints(25);
	
	System.out.println("name of the game "+ game.getName());
	System.out.println("no of players in game "+ game.getPlayers());
	System.out.println("points to be played in game "+ game.getPoints());
	}
	}