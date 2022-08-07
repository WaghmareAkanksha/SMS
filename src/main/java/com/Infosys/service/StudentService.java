package com.Infosys.service;

import java.util.List;

import com.Infosys.model.Student;

public interface StudentService {
	
	public Student createEmp(Student student);
	
	public List<Student> getStudent();
	
	public Student updateStudent(Student student);
	
	public void deleteById(Integer id);
	
	public void deleteStudent();
	
}
