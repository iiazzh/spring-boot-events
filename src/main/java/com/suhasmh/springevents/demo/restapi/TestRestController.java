package com.suhasmh.springevents.demo.restapi;

import com.suhasmh.springevents.demo.model.request.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping("/test")
    public Application testApplication() {
        var app = new Application();
        app.setStatus("Running");
        return app;
    }
}
