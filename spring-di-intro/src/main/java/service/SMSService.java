package service;

public class SMSService implements IMessageService {
    @Override
    public String sendMessage() {
        return "I am an SMS service, I sent an SMS";
    }
}
