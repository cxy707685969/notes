package com.demo.first.service;

import com.demo.first.dto.StudentDto;
import com.demo.first.entity.Student;
import com.demo.first.vo.StudentVo;
import org.springframework.transaction.annotation.Transactional;

public interface StudentService {
    StudentVo findStudentById(String id);
    StudentVo findStudentByName(String name);
    Integer save(Student student,char sex);
    StudentDto findStudentClass(StudentVo studentVo);
}
