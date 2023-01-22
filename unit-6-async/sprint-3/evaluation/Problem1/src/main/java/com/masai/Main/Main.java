package com.masai.Main;

import com.masai.Services.EmailService;
import com.masai.Services.TwitterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
      TwitterService twitterService=  ac.getBean("twitterService", TwitterService.class);
      twitterService.sendMessage("Is Good");

    }
}
