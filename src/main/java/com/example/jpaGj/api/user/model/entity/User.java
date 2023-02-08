package com.example.jpaGj.api.user.model.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Data
@Table(
        name = "TBL_USER"
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("시퀀스")
    private long uid;

    @Column(length = 50, unique = true, nullable = false)
    @Comment("이름")
    private String userName;

    @Column(length = 200)
    @Comment("이메일")
    private String email;
}
