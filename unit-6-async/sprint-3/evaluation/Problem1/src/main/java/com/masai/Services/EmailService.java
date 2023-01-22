package com.masai.Services;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email"+message);
    }

}
