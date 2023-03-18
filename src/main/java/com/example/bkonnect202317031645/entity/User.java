package com.example.bkonnect202317031645.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
<<<<<<< HEAD
@Table(name ="users")
=======
@Table(name = "users")
>>>>>>> github/master
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

<<<<<<< HEAD
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "SocialmediaId", unique = true)
    private String socialMediaId;


    // constructor, getter and setter methods
=======
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;


>>>>>>> github/master
}
