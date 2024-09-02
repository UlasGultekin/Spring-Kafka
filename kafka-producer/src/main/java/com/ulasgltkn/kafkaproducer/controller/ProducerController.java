package com.ulasgltkn.kafkaproducer.controller;

import com.ulasgltkn.kafkaproducer.dto.Product;
import com.ulasgltkn.kafkaproducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }
@GetMapping
    public String healthCheck(@RequestBody String message)
    {
        producerService.send(message);
        return message + ": Ok";
    }
@PostMapping
    public Product sendProductMessage(@RequestBody Product message){
        producerService.send(message);
        return message;
    }

}
