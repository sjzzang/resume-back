package com.resume.backend.resumebackend.controller;

import com.resume.backend.resumebackend.entity.Company;
import com.resume.backend.resumebackend.service.CompanyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Company")
@CrossOrigin(origins = "*")
public class CompanyController {

    private final CompanyService CompanyService;

    public CompanyController(CompanyService CompanyService) {
        this.CompanyService = CompanyService;
    }

    @GetMapping("/Companies")
    public List<Company> getCompany() {
        return CompanyService.getCompanys();
    }
}
