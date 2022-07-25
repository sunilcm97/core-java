package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {
	
PatientDTO[] dtos;
	
	//instance variable
	int index;
	
	public HospitalImpl (int size){
		System.out.println("Welcome to Raksha Hospital");
		dtos = new PatientDTO[size];
	}
	 @Override
	public boolean createPatient(PatientDTO dto){
		System.out.println("Inside createPatient() ");
		boolean isAdded = false;
		if(dto!=null && dto.getName()!=null && dto.getId()!=0 && dto.getAddress()!=null 
		&& dto.getGender()!=null  && dto.getContactNo()!=0 ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Patient details added succesfully");
		}
		else{
			System.out.println("Cannot add patient... please fill correct details");
		}
		return isAdded;
	}
	   @Override
	public void getPatientDetails(){
		System.out.println("Inside getPatientDetails() ");
		for(int i = 0; i<dtos.length; i++ ){
			System.out.println( dtos[i] );
		}
	}
	  @Override
	public boolean updatePatientAddressById(int id, String address){
		boolean updatedAddress = false;
		System.out.println("updatePatientAddressById() created");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()== id){
				dtos[i].setAddress(address);
				updatedAddress = true;
			}
			else {
				System.out.println("Entered id does not exist");
			}
		}		
		return updatedAddress;
	}
	
	 @Override
	public boolean updatePatientContactNoByName(String name, long contactNo){
		boolean updatedContactNo = false;
		System.out.println("updatePatientContactNoByName() invoked");
		for(int i=0; i<dtos.length;i++){
			// "Hitesh" equalsIgnoresCase "hitesh"			equals and equalsIgnoresCase
			if(dtos[i].getName().equals(name) ){
				dtos[i].setContactNo(contactNo);			
				updatedContactNo = true;
			}
			else {
				System.out.println("Entered Patient name does not exist");
			}
		}		
		return updatedContactNo;
	}
	   @Override
	public boolean updatePatientContactNoByAddress(String address, long contactNo){
		boolean updatedContactNo = false;
		System.out.println("updatePatientContactNoByName() invoked");
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getAddress().equals(address) ) {
				dtos[i].setContactNo(contactNo);			
				updatedContactNo = true;
			}
			else {
				System.out.println("Entered Patient address does not exist");
			}
		}		
		return updatedContactNo;
	}
	 @Override
	public String getPatientNameById(int id){
		String patientName = null;
		
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id ){
				patientName = dtos[i].getName();
			System.out.println("Patient name is :"+patientName);
		}
		else {
			System.out.println("Entered Id does not exist");
		}			
		}
		return patientName;
	}
	 @Override
	public long getPatientContactNoByName(String name){
		long contact = 0;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals(name) ){
				contact = dtos[i].getContactNo();
				System.out.println("Patient Contact No is :"+contact);
			}
			else {
				System.out.println("Entered Name doesnot exists");
			}
			
		}
		return contact;
	}
	 @Override
	public PatientDTO getPatientDetailsById(int id){
		PatientDTO patientDetails = null;
		System.out.println("getPatientDetailsById() invoked");
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getId()==id ){
				patientDetails = dtos[i];
			System.out.println(patientDetails);
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		return patientDetails;
	}
	 @Override
	public boolean deletePatientDetailsByName(String name){
		System.out.println("deletePatientIdById() invoked");
		boolean deletePatient=false;
		int i,j;
		for( i=0,j=0; j<dtos.length;j++){
			if(!dtos[j].getName().equals(name) ){
				dtos[i++] = dtos[j];
				System.out.println("Patient details deleted succesfully");
				deletePatient = true;
			}
			else {
				System.out.println("Entered name does not exist");
			}
		}
		dtos = Arrays.copyOf(dtos,i);				//utility structure
		return deletePatient;
	}
	 @Override
	public boolean deletePatientDetailsById(int id){
		System.out.println("deletePatientDetailsById() created");
		boolean deletePatientDetails=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(dtos[j].getId()!= id ){
				dtos[i++] = dtos[j];
				System.out.println("Patient details deleted succesfully");
				deletePatientDetails = true;
			}
			else {
				System.out.println("Entered Id does not exist");
			}
		}
		dtos = Arrays.copyOf(dtos,i);
		return deletePatientDetails;
	}

}
