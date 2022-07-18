import java.util.Arrays;

class Airport {
	
	//Airport has many Terminals
	TerminalsDTO dtos[];
	
	//instance variable
	int index;
	
	public Airport(int size){
		System.out.println("Welcome to KempeGowda International Airport");
		dtos = new TerminalsDTO[size];
	}
	
	public boolean createTerminals(TerminalsDTO dto) {
		System.out.println("TerminalsDTO() invoked");
		boolean isAdded = false;
		if(dto!= null && dto.getName()!= null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Terminal added successfully");
		}
		else{
			System.out.println("Please provide correct details");
		}
		return isAdded;		
	}
	
	public void getTerminalDetails(){
		System.out.println("Inside getTerminalDetails()");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i] );
		}		
	}
	public boolean updateTypeById(int id,String type){
		boolean updatedType=false;
		System.out.println("updateTypeById() created");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id ){
				dtos[i].setType(type);
				updatedType = true;
			}
			else {
				System.out.println("Entered id does not exist");
			}
		}
		return updatedType;		
	}
	public boolean updateTypeByName(String name, String type){
		boolean updatedType = false;
		System.out.println("updateTypeByName() created ");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equalsIgnoreCase(name) ){
				dtos[i].setType(type);
				updatedType = true;
			}
			else {
				System.out.println("Entered name does not exist");
			}
		}
		return updatedType;
	}
	
	public boolean updateNameById(String name, int id){
		boolean updatedName = false;
		System.out.println("updateNameById() invoked");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id ){
				dtos[i].setName(name);
				updatedName = true;
			}
			else {
				System.out.println("Entered Id does not exist");
			}
			
		}		
		return updatedName;
	}
	
	public TerminalsDTO getTerminalDetailsById(int id){
		TerminalsDTO terminalDetails = null;
		System.out.println("getTerminalDetailsById() invoked");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id ){
				terminalDetails = dtos[i];
				System.out.println(terminalDetails);
			}
			else {
				System.out.println("Entered id does not exist");
			}
		}
		return terminalDetails;
	}
	
	public boolean deleteTerminalsById(int id){
		System.out.println("deleteTerminalsById() created");
		boolean deleteTerminal=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(dtos[j].getId() != id ){
				dtos[i++] = dtos[j];
				System.out.println("Terminals deleted successfully");
				deleteTerminal = true;
			}
			else {
				System.out.println("Entered id does not exist");
			}
		}
		dtos = Arrays.copyOf(dtos,i);
		return deleteTerminal;
	}
	public boolean deleteTerminalsByName(String name){
		System.out.println("deleteTerminalsByName() created");
		boolean deleteTerminals = false;
		int i,j;
		for( i=0,j=0; j<dtos.length;j++){
			if(!dtos[j].getName().equals(name) ){
				dtos[i++] = dtos[j];
				System.out.println("Terminal deleted successfully");
				deleteTerminals = true;
			}
			else {
				System.out.println("Entered Name does not exist");
			}
		}
		dtos = Arrays.copyOf(dtos,i);
		return deleteTerminals;
		
	}
	
}	