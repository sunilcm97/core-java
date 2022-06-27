class class Instagram extends SocialMedia{
{
   
   public static void main(String a[]){
      Instagram ig = new Instagram();
          ig.founder = "Kevis Systrom";
		 ig.users = "1.3 Billion";
		 ig.ownedBy = "Meta";
		 ig.socialMedia();
		 
		 System.out.println(ig.founder+" "+ig.users+" "+ig.ownedBy);
   }
}