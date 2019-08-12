package com.demo.first.dao;

import static org.junit.Assert.*;

import com.demo.first.BaseTest;
import com.demo.first.entity.Classes;
import com.fasterxml.jackson.databind.ser.Serializers.Base;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassDaoTest extends BaseTest {

    @Autowired
    private ClassDao classDao;

    @Test
    public void findByStuId() {
        List<Classes> list = classDao.findByStuId("1111");
        list.stream().forEach(e -> System.out.println(e));
        int a = Integer.valueOf("3");
        Assert.assertEquals( a,list.size());
    }
}