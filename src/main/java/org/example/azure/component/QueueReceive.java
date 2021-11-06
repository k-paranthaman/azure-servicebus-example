package org.example.azure.component;

import org.example.azure.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueReceive {

//    private final String jmsTopicId = "salesmessage";
//
//    @JmsListener(destination = jmsTopicId, containerFactory = "jmsListenerContainerFactory")
//    public void receiveMessage(User user) {
//        System.out.println("Received message: "+ user.getName());
//    }
}
