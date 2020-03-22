package com.weidai.example.util.exception;

import java.io.Serializable;

/**
 * Created by long on 2017/12/12.
 */
public class BusinessException extends Exception implements Serializable {

    private int code;

    private String desc;

    public BusinessException(Throwable e) {
        super(e);
    }
}
