package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	

		@Autowired
		private StudentRepository studentRepository;
		
//		@Override
//		public Item getById(int id) throws ItemNotFoundException {
//			// TODO Auto-generated method stub
//			Optional<Item> itemById = itemRepository.findById(id);
//
//			if (itemById.isEmpty()) {
//				throw new ItemNotFoundException(" item not found with id : " + id);
//			}
//			Item item = itemById.get();
//			return item;
//
//		}
		
		
//		@Override
//		public List <Item> selectItemByName(String itemName) {
//
//			List<Item> item = itemRepository.findByItemName(itemName);
//
//			if (item.isEmpty()) {
//				throw new ItemNotFoundException("Item not found with name " + itemName);
//			}
//
//			return item;
//		}
		

	@Override
	public Student saveItem(Student student) {
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> newStudent = studentRepository.findById(student.getStudentName());
		
		Student student1 = studentRepository.save(student);

		return student1;
	}

	@Override
	public void deleteStudent(String studentName) {
		Optional<Student> optionalStudent = studentRepository.findBystudentName(studentName);
		if (optionalStudent.isEmpty()) {
			throw new StudentNotFoundException("Item Not found with id: " + studentName);
		}

		studentRepository.deleteByName(studentName);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> studentList= studentRepository.findAll();
		
		return studentList;
	}
	
	}
