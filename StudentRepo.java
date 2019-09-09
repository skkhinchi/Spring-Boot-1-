// create Repository Package

package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	
}
