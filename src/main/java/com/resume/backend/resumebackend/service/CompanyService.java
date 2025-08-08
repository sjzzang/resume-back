package com.resume.backend.resumebackend.service;


import com.resume.backend.resumebackend.entity.Company;
import com.resume.backend.resumebackend.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepo;

    public CompanyService(CompanyRepository companyRepo) {
        this.companyRepo = companyRepo;
    }


    public List<Company> getCompanys() {
        return companyRepo.findAll();
    }
}