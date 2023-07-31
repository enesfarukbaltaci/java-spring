package com.efb.repository;

import org.springframework.stereotype.Component;

@Component("dbRepository")
public class DBMessageRepository implements IRepository{

    public void saveMessage(String message){
        System.out.println("I am saving the message in db");
    }
}
