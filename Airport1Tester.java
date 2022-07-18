import java.util.Scanner;

class AirportTester {
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter No of Terminals to be added : ");
	int size = sc.nextInt();
	
	Airport air = new Airport(size);
	
	for(int i=0; i<size;i++){
		
		System.out.print("Enter Name  : ");
		String name =sc.next();
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		System.out.print("Enter Type : ");
		String type = sc.next();
		System.out.print("Enter No of Gates : ");
		int noOfGates = sc.nextInt();
	
	TerminalsDTO dto = new TerminalsDTO();
	dto.setName(name);
	dto.setId(id);
	dto.setType(type);
	dto.setNoOfGates(noOfGates);
	
	air.createTerminals(dto);
	}
	
	String option = null;
		
		do {
			System.out.println("Enter 1 to Fetch All Terminals details ");
			System.out.println("Enter 2 to update Terminal type by Id ");
			System.out.println("Enter 3 to update Terminal type by Name ");
			System.out.println("Enter 4 to update Terminal Name by Id ");
			System.out.println("Enter 5 to get Terminal Details by Id");
			System.out.println("Enter 6 to delete Terminal type by Id ");
			System.out.println("Enter 7 to delete Terminal type by Name ");
			System.out.print("Enter Choice :");
			
			
			int choice = sc.nextInt();
			switch(choice){
				
				case 1 : 	air.getTerminalDetails();
							break;
							
				case 2 :	System.out.print("Enter existingId : ");
							int existingId = sc.nextInt();
							System.out.print("Enter updated type : ");
							String updatedType = sc.next();
							air.updateTypeById(existingId,updatedType);
							break;
				case 3 :	System.out.print("Enter ExistingName : ");
							String existingName = sc.next();
							System.out.print("Enter updated type : ");
							String updatedtype = sc.next();
							air.updateTypeByName(existingName,updatedtype);
							break;
							
				case 4 :	System.out.print("Enter existingId :");
							int existsId = sc.nextInt();
							System.out.print("Enter updated Name :");
							String existsName = sc.next();
							air.updateNameById(existsName, existsId);
							break;
							
				case 5 :	System.out.print("Enter Terminal Id :");
							int terminalId = sc.nextInt();
							air.getTerminalDetailsById(terminalId);
							break;
				
				case 6 :	System.out.print("Enter Terminal id to be deleted : ");
							int existId = sc.nextInt();
							air.deleteTerminalsById(existId);
							break;
				case 7 :	System.out.print("Enter Terminal Name to be deleted : ");
							String existName = sc.next(); 
							air.deleteTerminalsByName(existName);
							break;
				default :	System.out.println("Entered choice doesnot exists");			
			}
			System.out.print("Do you want to continue y/n : ");
			option = sc.next();	
		}
		while(option.equals("y") );	
	}

}