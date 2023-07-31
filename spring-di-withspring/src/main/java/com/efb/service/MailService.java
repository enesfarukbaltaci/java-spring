package com.efb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements IMessageService{

    @Value("${app.email}")
    private String email;

    @Value("${app.count}")
    private Integer count;

    @Override
    public String sendMessage() {
        return "I am a mail service, I sent a message to : "+email+" :"+count;
    }

    public String getEmail(){
        return this.email;
    }
}
