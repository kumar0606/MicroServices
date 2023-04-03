package com.ravi.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MessageingConfig {
	public static final String QUEUE = "ravi_queue";
	public static final String TOPICEXCHANGE = "ravi_routingkey";
	public static final String ROUTINGKEY = "ravi_routingkey";
@Bean
	public Queue queue() {
		return new Queue(QUEUE);
	}
@Bean
	public TopicExchange exchange() {		
		return new TopicExchange(TOPICEXCHANGE);

	}
@Bean
	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);
	}

@Bean
public MessageConverter converter() {
	return new Jackson2JsonMessageConverter();
}

public AmqpTemplate template(ConnectionFactory connectionFactory) {
	final RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
	rabbitTemplate.setMessageConverter(converter());
	return rabbitTemplate;
	
}

}
