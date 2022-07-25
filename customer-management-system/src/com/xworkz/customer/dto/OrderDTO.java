package com.xworkz.customer.dto;


	
	import lombok.Data;
	import lombok.Getter;
	import lombok.Setter;
	import lombok.ToString;

	@ToString
	@Setter
	@Getter
	@Data
	public class OrderDTO {
		
		
		
		private int id;
		 private String name;
		 private String address;
		 private String location;
		 private long contactNo;;
	

}
