package com.weidai.example.biz.service.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/1/6.
 */
@Service("mailSendListener")
public class MailSendListener implements ApplicationListener<MailSendEvent>{

    @Override
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent eve = event;
        System.out.println("MailSendListener向："+eve.getTo()+"发送完一份邮件");

    }
}
