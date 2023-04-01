package com.helloworld2050.study.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = {"test_topic"})
    public void consume(String msg){
       log.info("consume msg:"+msg);
    }
}
