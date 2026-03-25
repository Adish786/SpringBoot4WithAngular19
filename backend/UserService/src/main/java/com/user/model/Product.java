package com.user.model;

public record Product(
        Long id,
        String name,
        String category,
        Double price
) {
}
