package com.suhasmh.springevents.demo.restapi;

import com.suhasmh.springevents.demo.daemon.publisher.MyPublisher;
import com.suhasmh.springevents.demo.model.request.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishEventApi {
    private final MyPublisher myPublisher;

    public PublishEventApi(MyPublisher myPublisher) {
        this.myPublisher = myPublisher;
    }

    @GetMapping("/event/publish")
    public Application publishMessage() {
        var app = new Application();
        myPublisher.publishCustomEvent("Suhas publishes an event message");
        //TODO: Make message part of input someday.
        app.setStatus("Published Event");
        return app;
    }
}
