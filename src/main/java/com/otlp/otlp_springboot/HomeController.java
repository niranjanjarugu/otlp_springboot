package com.otlp.otlp_springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

    @GetMapping(path = "/home")
    public String home() {
        logger.info("::::: HomeController :::::");
        return "home";
    }

}
