package com.lcpan.m07;

public class Employee2 {
	int empno;
	String name;

	public Employee2(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public Employee2(int empno) {
		this(empno, "Unknown");
	}

	public Employee2() {
		this(0);
	}

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}
	
	public static void main(String[] args) {
		Employee2 emp1 = new Employee2();
		emp1.printData();
		Employee2 emp2 = new Employee2(111);
		emp2.printData();
		Employee2 emp3 = new Employee2(222, "Mary");
		emp3.printData();			
	}
}
