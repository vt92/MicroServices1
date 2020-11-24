package com.vt.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vt.student.dal.entities.Student;
import com.vt.student.dal.entities.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Test
	public void testCreateStudent() {
		Student student =new Student();
		student.setId(2L);
		student.setName("Jon");
		student.setCourse("RestWeb Services");
		student.setFee(35D);
		
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1L);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(1L);
		//we will have to use ".get" as we are using optional
		student.get().setName("John-Updated"); 
		studentRepository.save(student.get());	
	}
	
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1L);
	}
}
