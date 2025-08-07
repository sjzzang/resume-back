package com.resume.backend.resumebackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "certifications")
@Getter
@Setter
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="certification_Index")
    private Integer certificationIndex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    @JsonIgnore
    private Member member;

    @Column(name = "certification_name", nullable = false, length = 100)
    private String certificationName;

    @Column(name = "issuance_office", nullable = false, length = 100)
    private String issuanceOffice;


    @Column(name = "acquisition_date")
    private LocalDate acquisitionDate;
}