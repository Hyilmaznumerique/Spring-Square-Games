package com.spring.squaregames;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface UserService {
    User getUser(String userId);
    User createUser(User user);
    User updateUser(String userId, User updatedUser, @NotNull UserDto userDto);
    void deleteUser(String userId);
    List<User> getAllUsers();
}
