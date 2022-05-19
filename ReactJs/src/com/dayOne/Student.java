package com.dayOne;

public class Student {

	private String name;
	private Integer rollno;
	private String address;
	private String phone;
	private String email;
	private Float marks1;
	private Float marks2;
	private Float marks3;
	private Float marks4;
	private Float marks5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getMarks1() {
		return marks1;
	}
	public void setMarks1(Float marks1) {
		this.marks1 = marks1;
	}
	public Float getMarks2() {
		return marks2;
	}
	public void setMarks2(Float marks2) {
		this.marks2 = marks2;
	}
	public Float getMarks3() {
		return marks3;
	}
	public void setMarks3(Float marks3) {
		this.marks3 = marks3;
	}
	public Float getMarks4() {
		return marks4;
	}
	public void setMarks4(Float marks4) {
		this.marks4 = marks4;
	}
	public Float getMarks5() {
		return marks5;
	}
	public void setMarks5(Float marks5) {
		this.marks5 = marks5;
	}
	
	public Float calc_average()
	{
		return (marks1 + marks2 + marks3 + marks4 + marks5)/5;
	}
	
	public String toString()
	{
		return "Name : " + name + "\tRoll Number : " + rollno + "\tEmail : " + email + "\tAvergae Marks : " + calc_average();
	}
	
}
