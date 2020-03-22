package com.weidai.example.biz.service.impl;

import com.weidai.example.biz.service.event.MailSendEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/1/6.
 */
@Service("mailSender")
public class MailSender implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.ctx = applicationContext;
    }

    public void sendMail(String to) {
        System.out.println("MailSend模拟发送邮件...");
        MailSendEvent mse = new MailSendEvent(ctx,to);
        ctx.publishEvent(mse);
    }
}
