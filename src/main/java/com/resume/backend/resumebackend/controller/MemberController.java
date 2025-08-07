package com.resume.backend.resumebackend.controller;

import com.resume.backend.resumebackend.entity.Member;
import com.resume.backend.resumebackend.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Member")
@CrossOrigin(origins = "*")
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
