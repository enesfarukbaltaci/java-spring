package com.efb.repository;

import com.efb.domain.Student;
import com.efb.exception.ConflictException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByLastName(String lastName);

    Boolean existsByEmail(String email) throws ConflictException;
}
