package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepo;

@Service

public class StudentService {
	@Autowired
	StudentRepo studentrepo;
	
	public List<Student> getAllStudent()
	{	
		List <Student>allStudent = new ArrayList <Student>();
		studentrepo.findAll().forEach(s->allStudent.add(s));
		return allStudent; 
	}
}
	
	//---------------------------------try to convert Java 8 feature into java7 
//	public List<Student> getAllStudent()
//	{	
//		List <Student>allStudent = new ArrayList <Student>();
//		for(Student student:studentrepo.findAll())
//		{
//			student.add(student);
//		}
//		return allStudent;
//	}
//}
//	}
	//-----------------------------------


	
