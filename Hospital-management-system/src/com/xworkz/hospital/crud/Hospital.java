package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	
	public boolean createPatient(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientAddressById(int id, String address);
	public boolean updatePatientContactNoByName(String name, long contactNo);
	public boolean updatePatientContactNoByAddress(String address, long contactNo);
	public String getPatientNameById(int id);
	public long getPatientContactNoByName(String name);
	public PatientDTO getPatientDetailsById(int id);
	public boolean deletePatientDetailsByName(String name);
	public boolean deletePatientDetailsById(int id);
	

}
