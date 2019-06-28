package com.test.di;

public class Student {

	private int id;
	private int age;
	private String fname;
	private String lname;
	private Address address;

	public Student(int id, int age, String fname, String lname,Address address) {

		this.id = id;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ "]";
	}

	

}
