package com.resume.backend.resumebackend.controller;

import com.resume.backend.resumebackend.entity.Certification;
import com.resume.backend.resumebackend.service.CertificationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Certification")
@CrossOrigin(origins = "*")
public class CertificationController {

    private final CertificationService CertificationService;

    public CertificationController(CertificationService CertificationService) {
        this.CertificationService = CertificationService;
    }

    @GetMapping("/Certifications")
    public List<Certification> getCertification() {
        return CertificationService.getCertifications();
    }
}
