package com.suhasmh.springevents.demo.daemon.publisher;

import com.suhasmh.springevents.demo.model.MessageToPublish;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public MyPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent(final String message) {
        MessageToPublish messageToPublish = new MessageToPublish(this, message);
        System.out.println("Publishing event");
        applicationEventPublisher.publishEvent(messageToPublish);
        System.out.println("Published event");
    }
}
