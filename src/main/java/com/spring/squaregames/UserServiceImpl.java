package com.spring.squaregames;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(String userId) {
        // TODO - Récupérer et retourner l'utilisateur avec l'identifiant 'userId'
        return null;
    }

    @Override
    public User createUser(User user) {
        // TODO - Créer et retourner le nouvel utilisateur
        return user;
    }

    @Override
    public User updateUser(String userId, User user, @NotNull UserDto userDto) {
        // TODO - Mettre à jour et retourner l'utilisateur avec l'identifiant 'userId'
        return user;
    }

    @Override
    public void deleteUser(String userId) {
        // TODO - Supprimer l'utilisateur avec l'identifiant 'userId'
    }

    @Override
    public List<User> getAllUsers() {
        // TODO - Récupérer et retourner la liste de tous les utilisateurs
        return List.of();
    }
}
