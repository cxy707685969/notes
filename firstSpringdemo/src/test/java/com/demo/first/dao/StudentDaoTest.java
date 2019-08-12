package com.demo.first.dao;

import com.demo.first.BaseTest;
import com.demo.first.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StudentDaoTest extends BaseTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void findStudentById() {
        Student student= studentDao.findStudentById("1111");
        System.out.println(student);
    }

    @Test
    public void findStudentByName() {
        Student student = studentDao.findStudentByName("娜娜");
    }

    @Test
    public void save() {
        Student student = new Student();
        student.setId("2222");
        student.setName("yesy");
        student.setSex(0);
        student.setPhone("120");
        studentDao.save(student);
        Assert.assertNotNull(student);
    }
}