class BookDTO {
	
	public BookDTO(){
		System.out.println("BookDTO() created");
	}	
	private int id;
	private String name;
	private String author;
	private int noOfPages;
	private String type;
	
	public int getId(){
		return id;
	} 
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author ;
	}
	
	public int getNoOfPages(){
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages){
		this.noOfPages = noOfPages;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public String toString(){
		return "Book Name :"+this.name+", "+"Id :"+this.id+", "+"Author :"+this.author+", "+"No of Pages :"+this.noOfPages+", "+"Type :"+this.type;
	}
}