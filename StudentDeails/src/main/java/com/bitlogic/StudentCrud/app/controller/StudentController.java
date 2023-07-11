package com.bitlogic.StudentCrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.StudentCrud.app.Service.StudentService;
import com.bitlogic.StudentCrud.app.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	@PostMapping("/save")
	public Student savestudentDetails(@RequestBody Student stu)
	{
		return ss.savestudentDetails(stu);
	}
	@GetMapping("/view")
	public List<Student> viewStudentDetails()
	{
		return ss.getData();
	}
	@DeleteMapping("/delete/{sid}")
	public void deleteData(@RequestParam int sid)
	{
		 ss.deleteData(sid);
		
	}

}
