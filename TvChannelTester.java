public class TvChannelTester{
    
	public static void main(String a[]){
	
	TvChannel tv = new TvChannel();
	
	tv.setName("Asia Net");
	tv.setLangauge("Malayalam");
	tv.setNo(545);
	
	System.out.println("name of the channel "+ tv.getName());
	System.out.println("langauge of channel "+ tv.getLangauge());
	System.out.println("channel no "+ tv.getNo());
	}
	}