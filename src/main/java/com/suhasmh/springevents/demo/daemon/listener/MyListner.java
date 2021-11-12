package com.suhasmh.springevents.demo.daemon.listener;

import com.suhasmh.springevents.demo.model.MessageToPublish;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListner implements ApplicationListener<MessageToPublish> {
    @Override
    public void onApplicationEvent(MessageToPublish event) {
        System.out.println("Listening success. Message published by publisher was: " + event.getSomeMessageToPublish());
    }
}
