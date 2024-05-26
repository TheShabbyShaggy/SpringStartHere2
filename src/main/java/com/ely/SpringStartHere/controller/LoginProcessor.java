package com.ely.SpringStartHere.controller;

import com.ely.SpringStartHere.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username;
    private String password;

    private final LoggedUserManagementService loggedUserManagementService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean logic() {
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loggedIn = false;

        if(username.equals("natalie") && password.equals("password")) {
            loggedIn = true;
            loggedUserManagementService.setUsername(username);
        }

        return loggedIn;
    }
}
