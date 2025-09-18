package com.example.Gateway.Configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service1", r -> r.path("/Users/**")
                        .uri("http://localhost:8080"))
                .route("service2", r -> r.path("/Budgets/**")
                        .uri("http://localhost:8181")) // microservicio GraphQL 2
                .build();
    }
}
