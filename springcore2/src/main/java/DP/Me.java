package DP;

import java.util.List;

public class Me {
	
	
	public Me() {
	
		System.out.println("------inside me-------");
	}

	private String name;
	private Job b;
	
	private List<Integer> listofId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getB() {
		return b;
	}

	public void setB(Job b) {
		this.b = b;
	}

	public List<Integer> getListofId() {
		return listofId;
	}

	public void setListofId(List<Integer> listofId) {
		this.listofId = listofId;
	}
	
	

}
