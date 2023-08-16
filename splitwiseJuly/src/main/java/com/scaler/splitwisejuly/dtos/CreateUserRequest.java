package com.scaler.splitwisejuly.dtos;

import com.scaler.splitwisejuly.models.User;
import lombok.Builder;

@Builder
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    public User toUser() {
        return User.builder()
                .name(name)
                .phoneNumber(phoneNumber)
                .email(email)
                .password(password)
                .build();
    }
}
