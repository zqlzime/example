package com.weidai.example.biz.service.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * Created by Administrator on 2020/1/6.
 */
public class MailSendEvent extends ApplicationContextEvent {

    private String to;
    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public MailSendEvent(ApplicationContext source,String to) {
        super(source);
        this.to = to;
    }

    public String getTo() {
        return this.to;
    }
}
