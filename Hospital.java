class Hospital{

  PatientDTO[] dtos = new PatientDTO[5];
   int index;
   
   public Hospital(){
   System.out.println("Hospital const is called");
   }
   
   public boolean createPatient(PatientDTO dto){
    System.out.println("inside createPatient");
    boolean isAdded = false;
     if(dto !=null && dto.getName() != null){
       this.dtos[index++] = dto;
            isAdded = true;
		System.out.println("Patient add sucessfully");
   }
   else{
   System.out.println("");
   }
   return isAdded;
   }
     public void getPatientDetails(){
		 System.out.println("Inside getPatientDetails()");
		 for(int i=0;i<dtos.length;i++){
			 System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getAddress()+"   "+dtos[i].getGender()+"  "+dtos[i].getContactNo());
		 }
	 }
}