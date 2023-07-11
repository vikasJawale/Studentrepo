package com.bitlogic.StudentCrud.app.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlogic.StudentCrud.app.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
