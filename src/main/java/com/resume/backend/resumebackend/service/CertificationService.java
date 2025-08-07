package com.resume.backend.resumebackend.service;


import com.resume.backend.resumebackend.entity.Certification;
import com.resume.backend.resumebackend.repository.CertificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {

    private final CertificationRepository certificaitionRepo;

    public CertificationService(CertificationRepository certificaitionRepo) {
        this.certificaitionRepo = certificaitionRepo;
    }


    public List<Certification> getCertifications() {
        return certificaitionRepo.findAll();
    }
}