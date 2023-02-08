package com.example.jpaGj;

import com.example.jpaGj.api.user.model.dto.UserRequestDto;
import com.example.jpaGj.api.user.model.dto.UserResponseDto;
import com.example.jpaGj.api.user.model.entity.User;
import com.example.jpaGj.api.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaGjApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() throws Exception {
		UserRequestDto request = new UserRequestDto();
		request.setUid(1L);
		UserResponseDto response = userService.dataTest(request);
		System.out.println("gjdata:::"+ response);
	}

	@Test
	void saveTest() throws Exception {
		UserRequestDto request = new UserRequestDto();
		request.setUserName("박광진3");
		request.setEmail("이메일3");
		UserResponseDto response = userService.save(request);
		System.out.println("gjdata:::"+ response);
	}

}
