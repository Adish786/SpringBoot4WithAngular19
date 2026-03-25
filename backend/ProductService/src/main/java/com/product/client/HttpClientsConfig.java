package com.product.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(basePackages = "com.product.client",
        types = {UserClient.class}, group = "user-client")
public class HttpClientsConfig {
}
