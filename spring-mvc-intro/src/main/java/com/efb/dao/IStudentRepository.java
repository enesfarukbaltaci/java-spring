package com.efb.dao;

import com.efb.domain.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    Student findById(Long id);
    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);


}
