package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student addStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);
	}

	@PutMapping("/update")
	public Student updatedStudentProfile(@RequestBody Student student) {

		return studentService.updateStudent(student);
	}

	@GetMapping("/find/{studentName}")
	public Student fetchItemById(@PathVariable("studentName") String stringName) {

		return studentService.getByName(studentName);
	}


	@DeleteMapping("/delete/{itemId}")
	public ResponseEntity<String> removeItem(@PathVariable("itemId") int itemId) {

		studentService.deleteStudent(studentName);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Student Deleted Successfully.", HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/all/item")
	public List<Student> fetchAllStudents() {

		return studentService.getAllStudents();

	}

}
