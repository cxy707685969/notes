package com.demo.first.dao;

import com.demo.first.entity.Classes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassDao extends JpaRepository<Classes, String> {
    List<Classes> findByStuId(String stuId);
}
