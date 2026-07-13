package com.manoellima.studying_spring.controller;

import com.manoellima.studying_spring.entities.User;
import com.manoellima.studying_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Process the HTTP verbs
@RequestMapping(value = "/users")
public class UserController{

    @Autowired //Dependency Injection
    private UserRepository repository;

    @GetMapping //HTTP GET verb
    public List<User> FindAll(){
//        List<User> result = repository.findAll();
//        return result;
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
//        User result = repository.findById(id).get();
//        return result;
        return repository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}