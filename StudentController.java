package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.StudentService;

@RestController
@RequestMapping("example")
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("")
	public List <Student> students()
	{
		return studentService.getAllStudent();
	}

}
