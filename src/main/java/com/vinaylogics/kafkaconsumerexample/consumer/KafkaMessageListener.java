package com.vinaylogics.kafkaconsumerexample.consumer;


import com.vinaylogics.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {

    @KafkaListener(topics = "vinaylogics-topic", groupId = "vl-group",
    topicPartitions = {@TopicPartition(topic ="vinaylogics-topic", partitions = {"3"})})
    public void consume(String message) {
        log.info("Consumer consume the message: {}",message);
    }
    @KafkaListener(topics = "vinaylogics-demo1", groupId = "vl-group-new")
    public void consume1(Customer customer) {
        log.info("Consumer consume the message: {}",customer.toString());
    }

//    @KafkaListener(topics = "vinaylogics-demo1", groupId = "vl-group")
//    public void consume2(String message) {
//        log.info("Consumer 2 consume the message: {}",message);
//    }
//
//    @KafkaListener(topics = "vinaylogics-demo1", groupId = "vl-group")
//    public void consume3(String message) {
//        log.info("Consumer 3 consume the message: {}",message);
//    }
//
//    @KafkaListener(topics = "vinaylogics-demo1", groupId = "vl-group")
//    public void consume4(String message) {
//        log.info("Consumer 4 consume the message: {}",message);
//    }


}
