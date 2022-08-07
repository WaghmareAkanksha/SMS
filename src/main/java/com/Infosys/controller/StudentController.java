package com.Infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.model.Student;
import com.Infosys.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stService;
	
	@PostMapping(value = "/saveEmp", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Student> addEmp(@RequestBody Student student) {
	
		Student createEmp = stService.createEmp(student);
		
		return new ResponseEntity<Student>(createEmp, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllEmp", produces = "application/json")
	public ResponseEntity<List<Student>> getAllStu(){
		
		List<Student> student = stService.getStudent();
		
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
	
	@PostMapping(value = "/updateStu", produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> updateEmp(@RequestBody Student student){
		
		Student u = stService.updateStudent(student);
		
		return new ResponseEntity<String>(u.getId()+" : Id Updated Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteById/{id}", consumes = "application/json" )
	public ResponseEntity<String> deleteStu(@PathVariable Integer id){
		
		stService.deleteById(id);
		
		return new ResponseEntity<String>("Id deleted Successfully" ,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteAll", consumes = "application/json" )
	public ResponseEntity<String> deleteAllStu(){
		
		stService.deleteStudent();
		
		return new ResponseEntity<String>("All Data deleted Successfully" ,HttpStatus.OK);
	}
	
}
