package com.spring.squaregames;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserDto {
    public final String id;
    public final String email;

    public UserDto(String id, String email, String s){
        this.id = id;
        this.email = email;
    }
    @GetMapping("/users/{userId}")
    public UserDto getUser(@PathVariable String userId) {
// TODO - actually get and return user with id 'userId'
        return null;
    }
}
