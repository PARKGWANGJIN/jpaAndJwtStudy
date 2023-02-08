package com.example.jpaGj.api.user.controller;

import com.example.jpaGj.api.user.model.dto.UserRequestDto;
import com.example.jpaGj.api.user.model.dto.UserResponseDto;
import com.example.jpaGj.api.user.model.entity.User;
import com.example.jpaGj.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<?> dataTest(UserRequestDto userRequestDto) throws Exception {
        UserResponseDto response = userService.dataTest(userRequestDto);
        return ResponseEntity.ok(response);
    }
}
