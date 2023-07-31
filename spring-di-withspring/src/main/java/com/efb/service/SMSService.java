package com.efb.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements IMessageService{
    @Override
    public String sendMessage() {
        return "I am an SMS service, I sent an SMS";
    }
}
