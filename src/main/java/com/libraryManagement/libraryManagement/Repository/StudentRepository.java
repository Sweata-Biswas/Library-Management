package com.libraryManagement.libraryManagement.Repository;

import com.libraryManagement.libraryManagement.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
