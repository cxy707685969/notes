package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
    Student getStudentById(String Id);
    Student getStudentByName(String Name);
}
