package com.vt.student.dal;

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
		student.setId(1L);
		student.setName("John");
		student.setCourse("Web Services");
		student.setFee(30D);
		
		studentRepository.save(student);
	}

}
