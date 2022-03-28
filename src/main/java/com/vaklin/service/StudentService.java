package com.vaklin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vaklin.models.Student;
import com.vaklin.repository.StudetnRepo;

//Service layer here the bussiness logic is done 

@Service   //like @Compononet but for readibility 
public class StudentService {
	@Autowired
	static StudetnRepo studentrepo;
	
	
	public StudentService(StudetnRepo studentrepo) {
		
		this.studentrepo = studentrepo;
	}


	public List<Student> getStudents() {
		
		return  studentrepo.findAll();
}

	
	public static void addNewStudent( Student student) {
		
		
		Student studentByEmail = studentrepo.findStudentByEmail(student.getEmail());
		
		
			if(studentByEmail!=null) {
				throw new IllegalStateException("email taken");
				
			}else {
				studentrepo.save(student);
			}
	}
}
