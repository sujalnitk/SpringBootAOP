package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public class User {
        String name;
        int age;
        String address;


    }

    private User user;

    public UserService () {
        user = new User("sujal" , 21 , "madhubani");
    }

    public void logIn() {
        System.out.println("User is logging in");
    }

    public void logOut() throws Exception {
        System.out.println("User is logging Out");
        throw new Exception("unable to logout the user");
    }

}
