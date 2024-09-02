package com.ulasgltkn.kafkaproducer.service;

import com.ulasgltkn.kafkaproducer.dto.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    @Value("${kafka-topic}")
    private String topic;

    public ProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Object message){
        this.kafkaTemplate.send(topic,message);
        System.out.println("Meesage is sent to Kafka "+ message);
    }
    @PostConstruct
    public void generetaMessage(){
        for (int i = 0; i < 10; i++) {
            Product product = new Product("Phone-"+i,"Phone ama ne Phone","Gold",50000,false);
            send(product);
            System.out.println(product);
        }

    }

}
