package com.example.demo.dao;

import com.example.demo.BaseTest;
import com.example.demo.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StudentDaoTest extends BaseTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void findStudentByName() {
        Student student = studentDao.findStudentByName("lomofu");
        System.out.println(student);
        Assert.assertEquals("1111",student.getId());
    }

}