package com.resume.backend.resumebackend.service;


import com.resume.backend.resumebackend.entity.Member;
import com.resume.backend.resumebackend.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository infoRepo;

    public MemberService(MemberRepository infoRepo) {
        this.infoRepo = infoRepo;
    }

    public Member getFirstMember() {
        return infoRepo.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("정보가 없습니다."));
    }
}