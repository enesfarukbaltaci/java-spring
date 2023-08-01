package com.efb.service;

import com.efb.domain.Student;
import com.efb.exception.ResourceNotFoundException;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    List<Student> findStudents(String lastName);
    Student findStudent(Long id) throws ResourceNotFoundException;
    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);

}
