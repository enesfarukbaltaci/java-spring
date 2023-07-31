package com.efb.app;

import com.efb.AppConfiguration;
import com.efb.service.IMessageService;
import com.efb.service.MailService;
import com.efb.thirdparty.ThirdPartyComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MyApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

//        IMessageService service = context.getBean("whatsappService", IMessageService.class);
//
//        System.out.println(service.sendMessage());


        IMessageService service2 = context.getBean("mailService",MailService.class);
        System.out.println(service2.sendMessage());


        ThirdPartyComponent thirdPartyComponent = context.getBean("thirdPartyComponent", ThirdPartyComponent.class);
        System.out.println(thirdPartyComponent.getMessage());

        context.close();
    }
}
