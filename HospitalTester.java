class HospitalTester{
 public static void main(String a[]){
       Hospital hs = new Hospital();
 
       PatientDTO dto = new PatientDTO();
            dto.setId(1);
            dto.setName("Cena");
            dto.setAddress("Kamakshipalya");
            dto.setGender(Gender.MALE);
            dto.setContactNo(9663459862L);
			hs.createPatient(dto);
		
        PatientDTO dto1 = new PatientDTO();	
		     dto1.setId(2);
            dto1.setName("Jhon");
            dto1.setAddress("Mysore");
            dto1.setGender(Gender.Female);
            dto1.setContactNo(9663459862L);
			hs.createPatient(dto1);
			
		PatientDTO dto2 = new PatientDTO();	
		     dto2.setId(3);
            dto2.setName("micky");
            dto2.setAddress("Bannur");
            dto2.setGender(Gender.Transgender);
            dto2.setContactNo(7777777777L);
			hs.createPatient(dto2);
			
			
		PatientDTO dto3 = new PatientDTO();	
		     dto3.setId(4);
            dto3.setName("Michal");
            dto3.setAddress("bnglr");
            dto3.setGender(Gender.MALE);
            dto3.setContactNo(6666666666L);
			hs.createPatient(dto3);
			
		PatientDTO dto4 = new PatientDTO();	
		     dto4.setId(5);
            dto4.setName("Majunu");
            dto4.setAddress("palya");
            dto4.setGender(Gender.MALE);
            dto4.setContactNo(5555555555L);
			hs.createPatient(dto4);	
			 hs.getPatientDetails();
 }
}