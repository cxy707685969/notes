package com.example.demo.service.Impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student getStudentById(String Id) {
        return studentDao.findStudentById(Id);
    }

    @Override
    public Student getStudentByName(String Name) {
        return studentDao.findStudentByName(Name);
    }
}
