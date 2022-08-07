package com.Infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infosys.model.Student;
import com.Infosys.repository.StudentRepo;

@Service
public class StudentServiceIMPL implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student createEmp(Student student) {
		
		Student save = studentRepo.save(student);
		
		return save;
	}

	@Override
	public List<Student> getStudent() {
		
		List<Student> findAll = studentRepo.findAll();
		
		return findAll;
	}

	@Override
	public Student updateStudent(Student student) {
		
		Student save = studentRepo.save(student);
		
		return save;
	}

	@Override
	public void deleteStudent() {

		studentRepo.deleteAll();
		
	}

	@Override
	public void deleteById(Integer id) {
		
		studentRepo.deleteById(id);
		
	}
	

}
