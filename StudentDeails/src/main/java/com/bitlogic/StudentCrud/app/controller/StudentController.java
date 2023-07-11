package com.bitlogic.StudentCrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.StudentCrud.app.Service.StudentService;
import com.bitlogic.StudentCrud.app.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	public Student savestudentDetails(@RequestBody Student stu)
	{
		return ss.savestudentDetails(stu);
	}

}
