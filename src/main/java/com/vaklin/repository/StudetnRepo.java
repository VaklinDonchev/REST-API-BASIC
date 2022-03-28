package com.vaklin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaklin.models.Student;
//DATA LAYER for accessing the database

@Repository
public interface StudetnRepo extends JpaRepository<Student, Integer> {
	
	// SELECT * FROM student WHERE email = ?
	
	public Student findStudentByEmail(String email);
	
	
	
}
