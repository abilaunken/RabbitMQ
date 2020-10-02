package com.kamehouse.rabbitmq.rabbitmq.producer;

import com.kamehouse.rabbitmq.rabbitmq.ConfigureRabbitMq;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private final RabbitTemplate rabbitTemplate;

    public SendMessageController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/enviar")
    public String sendMessage(@RequestParam String msg){
        rabbitTemplate.convertAndSend(ConfigureRabbitMq.EXCHANGE_NAME,"minhachavederota.teste", msg);
        return "Enviei a msg! : "+msg;
    }


}
