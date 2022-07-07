   public class NewspaperDTO{

  public NewspaperDTO(){
   System.out.println("Newspaper Object is Created");
    }
    private String name;
    private int noofPages ;
	private double price;
 
    public String getName(){
	return name;
     }
    public void setName(String name){
	this.name = name;
     }

     public int getNoofPages(){
	return noofPages;
     }
    public void setNoofPages(int noofPages){
	this.noofPages = noofPages;
     }
      
	 public double getPrice(){
	return price;
     }
    public void setPrice(double price){
	this.price = price;
     }
	 }








 
 