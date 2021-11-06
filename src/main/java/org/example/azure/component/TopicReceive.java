package org.example.azure.component;

import org.example.azure.model.User;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceive {

    private static final String TOPIC_NAME = "salesperformancemessage";

    private static final String SUBSCRIPTION_NAME = "Americas";


    @JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory",
            subscription = SUBSCRIPTION_NAME)
    public void receiveMessage(User user) {
        System.out.println("Received message: "+ user.getName());
    }
}
