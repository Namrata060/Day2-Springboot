package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student saveItem(Student student);
	public Student updateItem(Student student);
	public void deleteStudent(String studentName);
	public List<Student> getAllStudents();

}
