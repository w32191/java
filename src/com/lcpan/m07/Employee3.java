package com.lcpan.m07;

public class Employee3 {
	int empno;
	String name;
	static int count;

	public Employee3(int empno, String name) {
		this.empno = empno;
		this.name = name;
		count++;
	}

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}

	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Employee3[] emps = new Employee3[3];
		emps[0] = new Employee3(111, "Tom");
		emps[1] = new Employee3(222, "Mary");
		emps[2] = new Employee3(333, "David");
		for (Employee3 emp : emps)
			emp.printData();
		System.out.println("employee count = " + Employee3.getCount()); // 3
	}
}
