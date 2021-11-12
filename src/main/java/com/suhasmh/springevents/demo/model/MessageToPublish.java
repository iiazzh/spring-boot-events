package com.suhasmh.springevents.demo.model;

import org.springframework.context.ApplicationEvent;

public class MessageToPublish extends ApplicationEvent {
    private final String someMessageToPublish;

    public MessageToPublish(Object source, String someMessageToPublish) {
        super(source);
        this.someMessageToPublish = someMessageToPublish;
    }

    public String getSomeMessageToPublish() {
        return someMessageToPublish;
    }
}