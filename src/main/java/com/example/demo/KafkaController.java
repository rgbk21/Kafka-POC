package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    public KafkaController(Producer prod){
        this.producer = prod;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody Message message){
        this.producer.sendMessage(message.getMsg());
    }

}
