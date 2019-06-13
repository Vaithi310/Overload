package org.sample;

public class Employee {
	public void empId(String name) {
		System.out.println("string name"+name);
		
		}

	public void empId(String name, long phno,char block) {
		System.out.println("3 method"+name);
		System.out.println(phno +"\n" +block);
	}
	public void empId(int regno) {
	System.out.println("int method"+regno);	
	

	}public void empId(boolean perEmp) {
System.out.println("boolean method"+perEmp);
}
	public void empId(String manager,String project) {
		System.out.println("string string method" +manager);
	System.out.println(project);
	}
	public void empId(Float sal, String date ) {
		System.out.println("float string method"+sal);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.empId(145.254f,"12/5/91");
		emp.empId(false);
		emp.empId("ramya");
		emp.empId(123);
		emp.empId("abc", "testing");
		emp.empId("ramya", 12345789l, 'a');
	}
}
