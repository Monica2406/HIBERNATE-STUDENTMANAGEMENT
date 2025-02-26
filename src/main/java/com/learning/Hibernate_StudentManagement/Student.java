package com.learning.Hibernate_StudentManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id //(primary key)
	private int roll;
	private String name;
	private int age;
	private String gender;
	private String addrress;
	private String mobile;
	public Student() {
		
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Student(int roll, String name, int age, String gender, String addrress, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addrress = addrress;
		this.mobile = mobile;
	}
	
	

}
