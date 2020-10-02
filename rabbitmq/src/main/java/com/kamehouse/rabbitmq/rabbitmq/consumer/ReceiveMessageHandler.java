package com.kamehouse.rabbitmq.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveMessageHandler {

    private static final org.apache.logging.log4j.Logger log =
            org.apache.logging.log4j.LogManager.getLogger(ReceiveMessageHandler.class);

    public void handleMessage(String messageBody){
        log.info("Lidando com Menssages");
        log.info(messageBody);
    }






}
