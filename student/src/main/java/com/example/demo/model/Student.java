package com.example.demo.model;

import org.checkerframework.checker.index.qual.Positive;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private String studentName;
	
	@Column(name="student_age")
	private int studentAge;
	
	@Column(name="salary")
	@Positive
	private double salary;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
