package org.example.restApis;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String userLogin() throws Exception {
        userService.logIn();

        userService.logOut();

        return "User login endpoint called succesfully";
    }

}
