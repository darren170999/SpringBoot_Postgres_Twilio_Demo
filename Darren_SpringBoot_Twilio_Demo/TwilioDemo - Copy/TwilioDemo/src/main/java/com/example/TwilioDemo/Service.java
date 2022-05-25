package com.example.TwilioDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {
    private final TwilioSmsSender smsSender;
    @Autowired
    public Service(@Qualifier("twilio") TwilioSmsSender twilioSmsSender){
        this.smsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
