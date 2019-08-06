package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.util.REST;
import com.example.demo.vo.StudentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
//http://localhost:8080/student/1111
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public REST getStudentById(@PathVariable String id){
        StudentVO studentVO = new StudentVO();
        Student student = studentService.getStudentById(id);
        BeanUtils.copyProperties(student,studentVO);
        return REST.success(studentVO);
    }
//http://localhost:8080/student?name=lomofu
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public REST getStudentName(HttpServletRequest request){
        StudentVO studentVO  = new StudentVO();
        Student student = studentService.getStudentByName(request.getParameter("name"));
        BeanUtils.copyProperties(student,studentVO);
        return REST.success(studentVO);
    }
}
