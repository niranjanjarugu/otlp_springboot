package com.otlp.otlp_springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

    @Autowired private JsonToExcel jsonToExcel;
    @GetMapping(path = "/home")
    public String home() throws Exception{
        logger.info("::::: HomeController :::::");
        jsonToExcel.writeData();
        return "home";
    }

}
