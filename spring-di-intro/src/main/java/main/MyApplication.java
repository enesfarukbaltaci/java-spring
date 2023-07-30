package main;

import service.IMessageService;
import service.MailService;
import service.SMSService;

public class MyApplication {

    public static void main(String[] args) {
        //It's easy to pass another message service because we are using interface.
        //But still we have to change concrete class name to use target MessageService.
        //In the example below, we have to change our MessageService name to which message class we want.
        //So still hard-coded parts are here. If we'd have any config file we'd make changes easily.

        //IMessageService theService = new MailService();
        IMessageService theService = new SMSService();
        System.out.println(theService.sendMessage());
    }
}
