package com.product.client;

import com.product.entity.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange("http://localhost:8080/api/users")
public interface UserClient {

    @GetExchange
    List<User> getAll();

    @GetExchange("/{id}")
    User getById(@PathVariable Long id);

    @PostExchange
    User create(@RequestBody User user);

    @PutExchange("/{id}")
    User update(@PathVariable Long id, @RequestBody User user);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
