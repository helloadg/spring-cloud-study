package com.helloworld2050.study.kafka;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;


    public boolean send(Message message){
        try {
            CompletableFuture<SendResult<String, Object>> res =
                    kafkaTemplate.send("test_topic",JSON.toJSONString(message));
            SendResult<String, Object> result = res.get(5, TimeUnit.SECONDS);
            log.info(JSON.toJSONString(result));
        } catch (Exception e) {
            log.error("send fail",e);
            return false;
        }
        return true;
    }

}
