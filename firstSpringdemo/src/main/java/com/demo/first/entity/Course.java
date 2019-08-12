package com.demo.first.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course implements Serializable {
    @Id
    private String classId;
    private String className;
    private String classPlace;
    private String classTeacher;
}
