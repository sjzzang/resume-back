package com.resume.backend.resumebackend.repository;

import com.resume.backend.resumebackend.entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}