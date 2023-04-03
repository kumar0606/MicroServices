package com.ravi.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ravi.config.MessageingConfig;
import com.ravi.dto.OrderStatus;

@Component
public class User {
	@RabbitListener(queues=MessageingConfig.QUEUE)
public void consumemsgdeomqueue(OrderStatus orderStatus) {
	System.out.println("message from queue"+orderStatus);
}
}
