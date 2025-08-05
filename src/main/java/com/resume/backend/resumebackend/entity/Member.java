package com.resume.backend.resumebackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "members")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "kor_name", nullable = false, length = 100)
    private String korName;

    @Column(name = "eng_name", length = 100)
    private String engName;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "blog", columnDefinition = "TEXT")
    private String blog;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    @Column(name = "photo", columnDefinition = "TEXT")
    private String photo;
}