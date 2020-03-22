/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.mapper;

import com.weidai.example.dao.dataobject.UserDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * UserDOMapper的扩展 mapper 接口
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:48:36
 */
@Resource
public interface UserDOMapperExt extends UserDOMapper {

    List<UserDO> selectByUserId(Integer userId);

    List<UserDO> selectAll();

    List<UserDO> selectByUserIdList();
}