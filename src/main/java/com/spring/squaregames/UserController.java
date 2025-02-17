package com.spring.squaregames;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userservice;


    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userservice.getUser(userId);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody UserDto userDto) {
        User user = dtoToUser(userDto);
        return userservice.createUser(user);
    }

    public static @NotNull User dtoToUser(UserDto userDto) {
        User user = new User(userDto.id, userDto.id, userDto.email);
        return user;
    }
    public static @NotNull UserDto userToDto(User user) {
        UserDto userDto = new UserDto(user.id, user.name, user.email);
        return userDto;
    }

    @PutMapping("/users/{userId}")
    public UserDto updateUser(@PathVariable String userId, @RequestBody UserDto userDto) {
        // Récupérer l'utilisateur existant
        User existingUser = userservice.getUser(userId);

        // Convertir le DTO reçu en objet User pour la mise à jour
        User updatedUser = dtoToUser(userDto);

        // Appeler la méthode de mise à jour du service avec les 3 arguments
        User updated = userservice.updateUser(userId, updatedUser, userDto);

        // Convertir l'utilisateur mis à jour en DTO et retourner
        return userToDto(updated);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userservice.deleteUser(userId);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }
}

