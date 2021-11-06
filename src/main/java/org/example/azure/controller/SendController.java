package org.example.azure.controller;


import org.example.azure.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Value("${spring.jms.servicebus.topic-client-id}")
    private String jmsTopicId;


    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/messages")
    public String postMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend(jmsTopicId, new User(message));
        return message;
    }
}
