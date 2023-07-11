package com.bitlogic.StudentCrud.app.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.StudentCrud.app.Service.StudentService;
import com.bitlogic.StudentCrud.app.StudentRepo.StudentRepo;
import com.bitlogic.StudentCrud.app.model.Student;
@Service
public class StudentServiceimpl implements StudentService{
@Autowired
StudentRepo sr;
	@Override
	public Student savestudentDetails(Student stu) {
		// TODO Auto-generated method stub
		return sr.save(stu) ;
	}
	@Override
	public List<Student> getData() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
	@Override
	public void deleteData(int sid) {
		// TODO Auto-generated method stub
		 sr.deleteById(sid);
	}

}
