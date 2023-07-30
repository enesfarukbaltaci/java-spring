package service;

public class MailService implements IMessageService{
    @Override
    public String sendMessage() {
        return "I am a mail service, I sent a message";
    }
}
