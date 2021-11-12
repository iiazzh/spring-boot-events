package com.suhasmh.springevents.demo.restapi;

import com.suhasmh.springevents.demo.daemon.publisher.MyPublisher;
import com.suhasmh.springevents.demo.model.request.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    private final MyPublisher myPublisher;

    public TestRestController(MyPublisher myPublisher) {
        this.myPublisher = myPublisher;
    }

    @GetMapping("/test")
    public Application getAPerson() {
        var app = new Application();
        app.setStatus("Running");
        myPublisher.publishCustomEvent("Suhas publishes an event message");
        return app;
    }
}
