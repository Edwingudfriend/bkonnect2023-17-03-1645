package com.example.bkonnect202317031645.service;

import com.example.bkonnect202317031645.entity.User;
import com.example.bkonnect202317031645.entity.UserLoginRequest;
import com.example.bkonnect202317031645.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.bkonnect202317031645.service.InvalidCredentialsException;

@Service
public class UserLoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User login(UserLoginRequest request) throws UserNotFoundException, InvalidCredentialsException{
        User user = userRepository.findByUsername(request.getUsername());
        if (user==null){
            throw new UserNotFoundException("User not found with username: " + request.getUsername());
        }
        if (!passwordEncoder.matches(request.getPassword(),user.getPassword())){
            throw new InvalidCredentialsException("Invalid Password for User:" + request.getUsername());
        }
        return user;
    }


}
