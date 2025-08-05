package com.resume.backend.resumebackend.controller;

import com.resume.backend.resumebackend.entity.Member;
import com.resume.backend.resumebackend.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Member")
//@CrossOrigin(origins = "http://localhost:5173") // React 개발 서버 주소
public class MemberController {

    private final MemberService MemberService;

    public MemberController(MemberService MemberService) {
        this.MemberService = MemberService;
    }

    @GetMapping
    public Member getMember() {
        return MemberService.getFirstMember();
    }
}
