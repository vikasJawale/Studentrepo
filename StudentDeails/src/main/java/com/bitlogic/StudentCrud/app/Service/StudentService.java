package com.bitlogic.StudentCrud.app.Service;

import java.util.List;

import com.bitlogic.StudentCrud.app.model.Student;

public interface StudentService {

public 	Student savestudentDetails(Student stu);

public List<Student> getData();

public void deleteData(int sid);

}
