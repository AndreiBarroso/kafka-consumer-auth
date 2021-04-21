package br.mil.fab.ccarj.kafka.consumer.consumer;

import br.mil.fab.ccarj.kafka.consumer.model.EnrollmentMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", group = "group_json")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Auth_message", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(EnrollmentMessage user) {
        System.out.println("Consumed JSON Message: " + user);

        System.out.println(user.getCpf());


    }
}