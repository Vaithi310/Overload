package org.sample;

import java.util.Scanner;

public class scanner1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Pls enter id");
	int empId=sc.nextInt();
	System.out.println("enter id is"+empId);
	System.out.println("pls enter name");
	String empName=sc.next();
	System.out.println("enter name is"+empName);
	System.out.println("enter the salary");
	float empSal=sc.nextFloat();
	System.out.println("enter sal for"+empName +empSal);
	
	
}
}
