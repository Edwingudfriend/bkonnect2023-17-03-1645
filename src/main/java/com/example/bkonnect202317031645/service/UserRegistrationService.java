package com.example.bkonnect202317031645.service;

import com.example.bkonnect202317031645.entity.User;
import com.example.bkonnect202317031645.entity.UserRegistrationRequest;
import com.example.bkonnect202317031645.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    @Autowired
    private UserRepository userRepository;

    public User registerNewUser(UserRegistrationRequest request) throws UserAlreadyExistsException {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new UserAlreadyExistsException("Username already exists:" + request.getUsername());

        }
        if (request.getEmail() != null && userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email already exists:" + request.getEmail());
        }
        if (request.getPhoneNumber() != null && userRepository.existsByPhoneNumber(request.getPhoneNumber())) {
            throw new UserAlreadyExistsException("Phone Number already exists:" + request.getPhoneNumber());
        }
        if (request.getSocialMediaId() != null && userRepository.existsBySocialMediaId(request.getSocialMediaId())) {
            throw new UserAlreadyExistsException("Social Media ID already exists:" + request.getSocialMediaId());
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setSocialMediaId(request.getSocialMediaId());


        return userRepository.save(user);

    }

}
