package com.demo.first.dao;

import com.demo.first.entity.Classes;
import com.demo.first.entity.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouresDao extends JpaRepository<Course,String> {
    List<Course> findByClassIdIsIn(List<Classes> classesList);
}
