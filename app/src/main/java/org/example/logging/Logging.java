package org.example.logging;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
    @Before("execution(public void org.example.service.UserService.logIn())")
    public void log() {
        System.out.println("Before logging i am called");
    }

    @Around("execution(public void org.example.service.UserService.logOut())")
    public void logOutAdvice() {
        System.out.println("this will be called before logging out and after logging out");
    }


}
