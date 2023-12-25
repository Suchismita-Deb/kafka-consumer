package com.endUser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics=ConstantsTopic.LOCATION_TOPIC_NAME,groupId = ConstantsTopic.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
