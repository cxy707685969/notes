package com.demo.first.dao;


import com.demo.first.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,String> {
    Student findStudentById(String Id);
    Student findStudentByName(String name);
    Student save(Student student);
}
