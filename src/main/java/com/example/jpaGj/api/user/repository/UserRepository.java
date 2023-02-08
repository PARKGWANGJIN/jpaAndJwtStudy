package com.example.jpaGj.api.user.repository;

import com.example.jpaGj.api.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUid(long uid) throws Exception;
}
