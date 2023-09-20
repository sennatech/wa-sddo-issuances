//package br.com.sennatech.wasddoquotation.integration;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.integration.support.MessageBuilder;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Kafkaproducer {
//    private final MessageChannel output;
//
//    @Autowired
//    public Kafkaproducer(MessageChannel output) {
//        this.output = output;
//    }
//
//    public void send(String testMessage) {
//        output.send(MessageBuilder.withPayload(testMessage).build());
//    }
//}
