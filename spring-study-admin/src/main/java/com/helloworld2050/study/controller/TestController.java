package com.helloworld2050.study.controller;

import com.helloworld2050.study.kafka.KafkaProducer;
import com.helloworld2050.study.kafka.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("send")
    public String send(Integer id, String content) {
        boolean isOk = kafkaProducer.send(new Message(id, content));
        return isOk?"success":"fail";
    }
    @GetMapping("home")
    public String test(){
        return "hello world";
    }
}
