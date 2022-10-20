package dao;

import java.io.Serializable;

public class HosiptalDTO implements Serializable {

	private int id;
	private String paitentName;
	private String age;
	private String gender;
	private String roomNo;
	private String paitentPhone;
	private String address;
	private String doctorName;
	private String hosiptalName;
	private String hosiptalAddress;                           
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaitentName() {
		return paitentName;
	}                                                      //alt+shft+s
	public void setPaitentName(String paitentName) {
		this.paitentName = paitentName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {                                       
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getPaitentPhone() {
		return paitentPhone;
	}
	public void setPaitentPhone(String paitentPhone) {
		this.paitentPhone = paitentPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getHosiptalName() {
		return hosiptalName;
	}
	public void setHosiptalName(String hosiptalName) {
		this.hosiptalName = hosiptalName;
	}
	public String getHosiptalAddress() {
		return hosiptalAddress;
	}
	public void setHosiptalAddress(String hosiptalAddress) {
		this.hosiptalAddress = hosiptalAddress;
	}
	
	








}
