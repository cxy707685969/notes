package com.demo.first.service.impl;

import com.demo.first.dao.ClassDao;
import com.demo.first.dao.StudentDao;
import com.demo.first.dto.StudentDto;
import com.demo.first.entity.Classes;
import com.demo.first.entity.Student;
import com.demo.first.service.StudentService;
import com.demo.first.vo.StudentVo;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ClassDao classDao;

    @Override
    public StudentVo findStudentById(String id) {
        Student student = studentDao.findStudentById(id);
        StudentVo studentVo = new StudentVo();
        studentVo.setId(student.getId());
        studentVo.setName(student.getName());
        studentVo.setPhone(student.getPhone());
        if (student.getSex() == 0) {
            studentVo.setSex('男');
            return studentVo;
        }
        studentVo.setSex('女');
        return studentVo;
    }

    @Override
    public StudentVo findStudentByName(String name) {
        Student student = studentDao.findStudentByName(name);
        StudentVo studentVo = new StudentVo();
        studentVo.setId(student.getId());
        studentVo.setName(student.getName());
        studentVo.setPhone(student.getPhone());
        if (student.getSex() == 0) {
            studentVo.setSex('男');
            return studentVo;
        }
        studentVo.setSex('女');
        return studentVo;
    }

    @Override
    @Transactional
    public Integer save(Student student, char sex) throws RuntimeException {
        if (sex == '男') {
            student.setSex(0);
        } else {
            student.setSex(1);
        }
        student.setIsDel(0);
        if (studentDao.save(student).equals(null)) {
            return -1;
        }
        return 1;
    }

    @Override
    public StudentDto findStudentClass(StudentVo studentVo) {
        StudentDto studentDto = new StudentDto();
        //1.查询这个学生所选的课程的列表
        List<Classes> list = classDao.findByStuId(studentVo.getId());
        if (studentVo.getSex() == '男') {
            studentDto.setSex(0);
        } else {
            studentDto.setSex(1);
        }
        BeanUtils.copyProperties(studentVo, studentDto);
        studentDto.setIsDel(0);
        //2.赋值给dto
        studentDto.setClassList(list);

        return studentDto;
    }
}
