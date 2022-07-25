package com.xworkz.hospital;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

import java.util.Scanner;


public class HospitalTester {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	HospitalImpl hos = new HospitalImpl(size);
	

	
		for(int i=0; i<size; i++){
	System.out.print("Enter Patient's Name :");
	String name = sc.next();
	System.out.print("Enter Patient's Id :");
	int id = sc.nextInt();
	System.out.print("Enter Patient's Address :");
	String address = sc.next();
	System.out.print("Patient's Contact No :");
	long contactNo = sc.nextLong();
	System.out.print("Patients gender :");
	String gender = sc.next();
	
	PatientDTO dto = new PatientDTO(); 
	dto.setId(id);
	dto.setName(name);
	dto.setAddress(address);
	dto.setGender(Gender.valueOf(gender) );
	dto.setContactNo(contactNo);
	hos.createPatient(dto);
}	
String option = null;

do {
	System.out.println("Enter 1 to Fetch  Patient Details");
	System.out.println("Enter 2 to update Patient Address by Patient Id ");
	System.out.println("Enter 3 to update PatientContactNo By Patient Name");
	System.out.println("Enter 4 to update PatientContactNo By Patient Address ");
	System.out.println("Enter 5 to get Patient name By Patient Id ");
	System.out.println("Enter 6 to get Patient ContactNo by Patient Name");
	System.out.println("Enter 7 to delete Patient details by Patient Name ");
	System.out.println("Enter 8 to delete Patient details By Patient Id ");
	System.out.println("Enter 9 to get Patient Details by Id ");
	System.out.print("Enter choice :");
	
	int choice = sc.nextInt();
	switch(choice){
		
		case 1 : hos.getPatientDetails();
				break;
				
		case 2 : System.out.print("Enter the existing id : ");
				int existingId = sc.nextInt(); 
				System.out.print("Enter the address to be updated : ");
				String updatedAddress = sc.next();
				hos.updatePatientAddressById(existingId,updatedAddress);
				break;
				
		case 3 : System.out.print("Enter existing Patient name : ");
				String existingPatientName = sc.next();
				System.out.print("Enter ContactNo to be updated : ");
				long updateContactNo = sc.nextLong();
				hos.updatePatientContactNoByName(existingPatientName, updateContactNo);
				break;
				
		case 4 : System.out.print("Enter existing Patient Address : ");
				String existingPatientAddress = sc.next();
				System.out.print("Enter ContactNo to be updated : ");
				long updatedContactNo = sc.nextLong();
				hos.updatePatientContactNoByAddress(existingPatientAddress, updatedContactNo);
				break;
				
		case 5 : System.out.print("Enter existing id :");
				int existId = sc.nextInt();
				hos.getPatientNameById(existId);
				//System.out.println("Patient Name is :");
				break;
				
		case 6 : System.out.print("Enter Existing Patient Name :");
				String patientName = sc.next();
				hos.getPatientContactNoByName(patientName);
				break;
		
		case 7 : System.out.print("Enter Patient Name to be deleted : ");
				String existingName = sc.next();
				hos.deletePatientDetailsByName(existingName);
				break;
				
		case 8 : System.out.print("Enter Patient Id to be deleted : ");
				int existingPatientId = sc.nextInt();
				hos.deletePatientDetailsById(existingPatientId);
				break;
				
		case 9 : System.out.print("Enter Patient Id to get Patient Details :");
				int patientId = sc.nextInt();
				hos.getPatientDetailsById(patientId);
				break;
				
		default : System.out.println("Given choice cannot be delivered.");
			
	}
	System.out.print("Do you want to continue y/n :");
	option = sc.next();
}
while (option.equals("y") );
}

}
