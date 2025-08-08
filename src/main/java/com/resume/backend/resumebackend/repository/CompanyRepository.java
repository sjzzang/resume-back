package com.resume.backend.resumebackend.repository;

import com.resume.backend.resumebackend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}