package com.chrisdev.springbootwebapplication.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userID, String password) {
        return (userID.equals("test") && password.equals("test"));
    }
}
