package com.weidai.example.mvc.controller.model;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * Created by long on 2017/12/16.
 */
public class User implements Serializable {

    private String userName;

    private String idNumber;

    private String uid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode(){
        int result = 17;
//        result = 31 * result + (userName == null ? 0 : userName.hashCode());
//        result = 31 * result + (idNumber == null ? 0 : idNumber.hashCode());
//
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;//地址相等
        }

        if(obj == null){
            return false;//非空性：对于任意非空引用x，x.equals(null)应该返回false。
        }

        if(obj instanceof User){
            User other = (User) obj;
            //需要比较的字段相等，则这两个对象相等
            if(equalsStr(this.userName, other.userName)
                    && equalsStr(this.idNumber, other.idNumber)){
                return true;
            }
        }

        return false;
    }

    private boolean equalsStr(String str1, String str2){
        if(StringUtils.isEmpty(str1) && StringUtils.isEmpty(str2)){
            return true;
        }
        if(!StringUtils.isEmpty(str1) && str1.equals(str2)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "userName:" + this.userName+",uid="+this.uid;
    }


}
