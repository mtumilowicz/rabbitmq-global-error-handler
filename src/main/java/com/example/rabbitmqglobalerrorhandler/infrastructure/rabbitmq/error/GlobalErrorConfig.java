package com.example.rabbitmqglobalerrorhandler.infrastructure.rabbitmq.error;

import org.springframework.amqp.rabbit.listener.ConditionalRejectingErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ErrorHandler;

/**
 * Created by mtumilowicz on 2018-09-24.
 */
@Configuration
public class GlobalErrorConfig {
    @Bean
    public ErrorHandler errorHandler(RejectingErrorHandler rejectingErrorHandler) {
        return new ConditionalRejectingErrorHandler(rejectingErrorHandler);
    }
}
