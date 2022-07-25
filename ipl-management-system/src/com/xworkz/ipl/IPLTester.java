package com.xworkz.ipl;

import java.util.Scanner;

import com.xworkz.ipl.dto.IplDTO;

public class IPLTester {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr Host");
		String host = sc.next();
		
		System.out.println("Enetr NoOfteams");
		int noOfTeams = sc.nextInt();
		
		System.out.println("Enetr Owner");
		String owner = sc.next();
		
		
		
		// TODO Auto-generated method stub
		IplDTO ipl = new IplDTO();
		   ipl.setHost(host);
		   ipl.setNoofTeams(noOfTeams);
		   ipl.setOwner(owner);
 System.out.println(ipl);
	}

}
