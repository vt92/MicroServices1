package com.vt.student.dal.entities.repos;

import org.springframework.data.repository.CrudRepository;

import com.vt.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
