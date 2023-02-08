package com.example.jpaGj.api.user.model.dto;

import lombok.Data;

@Data
public class UserRequestDto {

    private long uid;

    private String userName;

    private String email;
}
