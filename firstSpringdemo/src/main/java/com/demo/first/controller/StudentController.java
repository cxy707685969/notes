package com.demo.first.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.demo.first.entity.Student;
import com.demo.first.service.StudentService;
import com.demo.first.util.Restful;
import com.demo.first.vo.StudentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Restful getStudentById(@PathVariable String id){
        StudentVo studentVo=studentService.findStudentById(id);
        return Restful.success(studentVo);
    }
    @PostMapping (value = "/save")
    public Restful save(@RequestBody StudentVo studentvo){
        Student student=new Student();
        BeanUtils.copyProperties(studentvo,student);
        if (studentService.save(student,studentvo.getSex()).equals(1)){
            return Restful.success(student);
        }else{
            return Restful.fail(student);
        }
    }

}
