package com.spring.squaregames;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.jetbrains.annotations.NotNull;

public class UserCreationParams {
    public final @NotNull @Email String email;
    public final @NotEmpty String password;

    public UserCreationParams(@NotNull @Email String email, @NotEmpty String password) {
        this.email = email;
        this.password = password;
    }
}
