package com.example.jpaGj.api.user.model.dto;

import lombok.Data;

@Data
public class UserResponseDto {

    private long uid;

    private String userName;

    private String email;
}
