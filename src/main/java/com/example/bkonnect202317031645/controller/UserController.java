package com.example.bkonnect202317031645.controller;

import com.example.bkonnect202317031645.entity.User;
import com.example.bkonnect202317031645.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        Optional <User> userOptional=userRepository.findById(id);
        if (userOptional.isPresent()){
            return ResponseEntity.ok(userOptional.get());

        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        Optional<User> userOptional=userRepository.findById(id);
        if (userOptional.isPresent()){
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();




        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
