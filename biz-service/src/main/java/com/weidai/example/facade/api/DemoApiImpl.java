/**
 *
 * Copyright (C), 2011-2016, 微贷网.
 */
package com.weidai.example.facade.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.weidai.example.biz.service.DemoService;

/**
 * 发布服务的实现
 *
 * @author exgods
 * @version $Id: DemoApiImpl.java, v 0.1 2016年5月15日 下午6:40:21 exgods Exp $
 */
@org.springframework.stereotype.Service("DemoService")
public class DemoApiImpl implements DemoService{

    @Override
    public void update() {

    }
}
