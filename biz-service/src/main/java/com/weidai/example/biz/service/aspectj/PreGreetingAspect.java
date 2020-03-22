package com.weidai.example.biz.service.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Administrator on 2020/1/7.
 */
@Aspect
public class PreGreetingAspect {

    @Before("execution(* greetTo(..))")
    public void beforeGreetring() {
        System.out.println("How are you");
    }
}
