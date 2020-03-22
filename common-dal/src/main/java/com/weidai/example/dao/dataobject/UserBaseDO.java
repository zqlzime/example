/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.dataobject;

import java.io.Serializable;

/**
 * 
 * u_base 表对应的实体类
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:17:12
 */
public class UserBaseDO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    /** 用户ID **/
    private Integer uid;

    /** 展示名 **/
    private String userName;

    /** 手机 **/
    private String mobile;

    /** 性别:0-男,1-女 **/
    private Integer sex;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}