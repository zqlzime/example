package com.weidai.example.biz.service.impl;

import com.weidai.example.biz.service.UserService;
import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.dao.mapper.UserDOMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by WD05709 on 2019/1/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapperExt userDOMapperExt;

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public int insert(UserDO userDO) {
        return userDOMapperExt.insert(userDO);
    }
}
