package com.zyw.sendmail.times;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class TimeSche {

    @Autowired
    private JavaMailSender javaMailSender;


    @Scheduled(cron = "0/5 * * * * *")
    public void cron() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("dreamtoi@163.com");
        simpleMailMessage.setTo("ywzhup@isoftstone.com");
        simpleMailMessage.setSubject("first mail");
        simpleMailMessage.setText("java send mail");
        javaMailSender.send(simpleMailMessage);

    }


}
