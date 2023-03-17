package com.example.bkonnect202317031645.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRegistrationRequest {

    private String username;
    private String password;
    private  String email;
    private String phoneNumber;
    private String socialMediaId;



}
