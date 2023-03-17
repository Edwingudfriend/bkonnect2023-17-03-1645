package com.example.bkonnect202317031645.repository;

import com.example.bkonnect202317031645.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


//AADDED COMMENT
public interface UserRepository extends JpaRepository <User,Long > {
    User findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsBySocialMediaId(String SocialMediaId);
}









