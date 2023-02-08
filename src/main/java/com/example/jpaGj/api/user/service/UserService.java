package com.example.jpaGj.api.user.service;

import com.example.jpaGj.api.user.model.dto.UserRequestDto;
import com.example.jpaGj.api.user.model.dto.UserResponseDto;
import com.example.jpaGj.api.user.model.entity.User;
import com.example.jpaGj.api.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto dataTest(UserRequestDto request) throws Exception{
        ModelMapper modelMapper = new ModelMapper();
        
        User user = userRepository.findByUid(request.getUid());
        user.setUserName("박광진");
        UserResponseDto response = modelMapper.map(user, UserResponseDto.class);
        response.setUserName("박성수");
        return response;
    }

    public UserResponseDto save(UserRequestDto request) throws Exception{
        ModelMapper modelMapper = new ModelMapper();

        User user = userRepository.save(modelMapper.map(request, User.class));

        UserResponseDto response = modelMapper.map(user, UserResponseDto.class);
        return response;
    }
}
