/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.dataobject;

import java.io.Serializable;

/**
 * 
 * student 表对应的实体类
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:48:36
 */
public class StudentDO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    
    private Integer id;

    
    private Integer studentId;

    
    private String name;

    
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}