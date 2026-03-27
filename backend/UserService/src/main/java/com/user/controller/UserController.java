package com.user.controller;

import com.user.model.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
//@Endpoint(id = "/api")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
   // @ReadOperation
    public List<User> getAll() { return repository.findAll(); }

    @GetMapping("/{id}")
   // @ReadOperation
    public ResponseEntity<User> getById(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
//    @WriteOperation
    public User create(@RequestBody User user) { return repository.save(user); }

    @PutMapping("/{id}")
  //  @WriteOperation
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
        if (!repository.existsById(id)) return ResponseEntity.notFound().build();
        user.setId(id);
        return ResponseEntity.ok(repository.save(user));
    }

    @DeleteMapping("/{id}")
  //  @DeleteOperation
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repository.existsById(id)) return ResponseEntity.notFound().build();
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

