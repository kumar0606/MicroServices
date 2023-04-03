package com.ravi.publisher;



import java.util.UUID;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.config.MessageingConfig;
import com.ravi.dto.Order;
import com.ravi.dto.OrderStatus;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
@PostMapping("/{restaurentname}")
	public String FoodOrder(@RequestBody Order order,@PathVariable String restaurentname) {
	order.setOrderid(UUID.randomUUID().toString());
	OrderStatus orderStatus=new OrderStatus(order,"process","oreder sends to restaurent"+restaurentname);
	rabbitTemplate.convertAndSend(MessageingConfig.TOPICEXCHANGE, MessageingConfig.ROUTINGKEY, orderStatus);
		return "SUCCESS!!!";
	
}
}
