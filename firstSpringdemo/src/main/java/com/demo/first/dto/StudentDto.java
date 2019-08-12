package com.demo.first.dto;

import com.demo.first.entity.Classes;
import java.util.List;
import lombok.Data;

@Data
public class StudentDto {
    private String id;
    private String name;
    private Integer sex;
    private String phone;
    private Integer isDel;
    private List<Classes> classList;
}
