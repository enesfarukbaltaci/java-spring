package com.efb.repository;

import org.springframework.stereotype.Component;

@Component("fileRepository")
public class FileMessageRepository implements IRepository{
    @Override
    public void saveMessage(String string) {
        System.out.println("I am saving message in file");
    }
}
