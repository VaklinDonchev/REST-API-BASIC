package com.vaklin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaklin.models.Student;
import com.vaklin.service.StudentService;
//API LAYER

@RestController
@RequestMapping(path="/api/v1/student")
public class StudentController {
	
		@Autowired
		final StudentService studetnService;
		
		
		public StudentController(StudentService studetnService) {
		
			this.studetnService = studetnService;
		}
		
		
		@GetMapping()
		public List<Student> getStudents() 
		{
			return studetnService.getStudents();
		}
		@PostMapping
		public void registerNewStudent(@RequestBody Student student) {
			StudentService.addNewStudent(student);
		}
}
