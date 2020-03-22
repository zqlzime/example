package com.weidai.example.test.proxy.aop.creator;


import com.weidai.example.test.proxy.aop.interceptor.ProxyInterceptor;

import java.util.List;

/**
 * Created by 王萍 on 2017/11/12 0012.
 */
public interface ProxyCreator {

    public <T> T createProxy(final Class<?> targetClass, final List<ProxyInterceptor> interceptors);
}
