package com.efb.service;

import com.efb.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("whatsappService")
public class WhatsappService implements IMessageService {



   /* Field Injection
    @Autowired
    @Qualifier("fileRepository")
    private IRepository repository;
    */

    /*  Constructor Injection
      @Autowired
      public WhatsappService(@Qualifier("dbRepository") IRepository repository){
          this.repository = repository;
      }
    */
    private IRepository repository;

   // Setter Injection
    @Autowired
    public void setRepository(@Qualifier("dbRepository") IRepository repository){
        this.repository = repository;
    }

    @Override
    public String sendMessage() {
        repository.saveMessage("I am whatsapp service");
        return "I am a whatsapp service, I sent a whatsapp message";
    }
}
