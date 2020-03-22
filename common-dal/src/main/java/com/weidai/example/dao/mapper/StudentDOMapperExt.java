/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.mapper;

import com.weidai.example.dao.dataobject.StudentDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * StudentDOMapper的扩展 mapper 接口
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:48:36
 */
@Resource
public interface StudentDOMapperExt extends StudentDOMapper {

    List<StudentDO> selectStudentByParam(Integer userId);
}