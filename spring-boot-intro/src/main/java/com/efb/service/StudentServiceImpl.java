//package com.efb.service;
//
//import com.efb.domain.Student;
//import com.efb.exception.ResourceNotFoundException;
//import com.efb.repository.IStudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentServiceImpl implements IStudentService{
//
//    private IStudentRepository studentRepository;
//
//    @Autowired // If we have only one constructor, no need to put @Autowired.
//    public StudentServiceImpl(IStudentRepository studentRepository){
//        this.studentRepository=studentRepository;
//    }
//
//
//
//    @Override
//    public List<Student> getAll() {
//        return studentRepository.findAll();
//    }
//
//    @Override
//   public List<Student> findStudents(String lastName) {
//        return studentRepository.findByLastName(lastName);
//    }
//
//    @Override
//    public Student findStudent(Long id) throws ResourceNotFoundException {
//        Student student = studentRepository.findById(id);
//        if (student==null){
//            throw new ResourceNotFoundException("Student not found with id: "+id);
//        }
//        return student;
//    }
//
//    @Override
//    public void createStudent(Student student) {
//        studentRepository.createStudent(student);
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//        studentRepository.updateStudent(student);
//    }
//
//    @Override
//    public void deleteStudent(Long id) {
//        studentRepository.deleteStudent(id);
//    }
//}
