package com.masai.Proccessormsg;

import com.masai.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProcessorImpl implements MessageProcessor{
    @Autowired
    MessageService messageService;
    @Override
    public void processMessage(String message) {
           messageService.sendMessage(message);
    }
}
