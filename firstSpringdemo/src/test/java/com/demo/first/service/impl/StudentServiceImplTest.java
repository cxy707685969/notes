package com.demo.first.service.impl;

import static org.junit.Assert.*;

import com.demo.first.BaseTest;
import com.demo.first.dto.StudentDto;
import com.demo.first.entity.Student;
import com.demo.first.service.StudentService;
import com.demo.first.vo.StudentVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImplTest extends BaseTest {

    @Autowired
    private StudentService studentService;


    @Test
    public void findStudentById() {
        StudentVo studentVo=studentService.findStudentById("1111");
        System.out.println(studentVo);
    }

    @Test
    public void findStudentByName() {
        StudentVo studentVo=studentService.findStudentByName("娜娜");
        System.out.println(studentVo);
    }

    @Test
    public void save() {
        Student student = new Student();
        student.setId("2232");
        student.setName("yese");
        student.setSex(0);
        student.setPhone("120");
        //studentService.save(student);
        Assert.assertNotNull(student);
    }

    @Test
    public void findStudentClass() {
        StudentVo studentVo = new StudentVo();
        studentVo.setId("1111");
        studentVo.setName("娜娜");
        studentVo.setSex('女');
        studentVo.setPhone("110");
        StudentDto studentDto = studentService.findStudentClass(studentVo);
        System.out.println(studentDto.toString());
    }
}