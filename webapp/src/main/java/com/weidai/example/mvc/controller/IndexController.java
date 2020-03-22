package com.weidai.example.mvc.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.rpc.Result;
import com.weidai.example.biz.service.DemoService;
import com.weidai.example.biz.service.UserService;
import com.weidai.example.biz.service.impl.MailSender;
import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.mvc.controller.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by long on 2017/12/16.
 */
@Controller
@RequestMapping("index")
public class IndexController {

    protected final Logger logger = Logger.getLogger(IndexController.class);


    /*@Autowired
    private DemoService demoService;*/



    @ResponseBody
    @RequestMapping("/test")
    public User test(String uid) {
        
        //demoService.update();
        User result = new User();
        result.setIdNumber("13412312");
        result.setUserName("zhangsan");
        result.setUid(uid);



        logger.info(com.alibaba.fastjson.JSON.toJSON(result));

        return result;
    }


}
