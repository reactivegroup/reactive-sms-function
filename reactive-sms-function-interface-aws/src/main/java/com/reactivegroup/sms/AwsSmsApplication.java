package com.reactivegroup.sms;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * @apiNote https://www.baeldung.com/spring-cloud-function
 */
public class AwsSmsApplication extends SpringBootRequestHandler<String, String> {
}
