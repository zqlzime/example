package com.weidai.example.mvc.controller;

import com.weidai.example.biz.service.UserService;
import com.weidai.example.biz.service.impl.MailSender;
import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.mvc.controller.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by long on 2017/12/16.
 */
@Controller
@RequestMapping("user")
public class UserController {

    protected final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private MailSender mailSender;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public User test(String uid) {
        logger.info(uid);
        User result = new User();
        result.setIdNumber("13412312");
        result.setUserName("zhangsan");
        result.setUid(uid);

        UserDO userDO = new UserDO();
        userDO.setName("zhangsan");
        userDO.setAge(11);
        userDO.setUserId(13123);
        try {
            userService.insert(userDO);
        }catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.sendMail("zql@163.com");
        return result;
    }


}
