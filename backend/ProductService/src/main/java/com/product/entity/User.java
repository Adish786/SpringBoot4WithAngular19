package com.product.entity;

public record User(
        Long id,
        String name,
        String email,
        String role
) {
}
