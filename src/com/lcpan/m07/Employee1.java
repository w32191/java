package com.lcpan.m07;

public class Employee1 {
	int empno;
	String name;

	public Employee1(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public Employee1(int empno) {
		this.empno = empno;
		this.name = "Unknown";
	}

	public Employee1() {
	}

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}
	
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		emp1.printData();
		Employee1 emp2 = new Employee1(111);
		emp2.printData();
		Employee1 emp3 = new Employee1(222, "Mary");
		emp3.printData();			
	}
}
