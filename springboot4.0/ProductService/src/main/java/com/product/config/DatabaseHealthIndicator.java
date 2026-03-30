package com.product.config;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        // Simulate check
        boolean up = checkDatabaseConnection();
        if (up) {
            return Health.up().build();
        }
        return Health.down().withDetail("DB Error", "Connection failed").build();
    }
    private  static  boolean checkDatabaseConnection() {
        // Implement actual DB check logic here
        return true; // Assume it's always up for this example
    }
}