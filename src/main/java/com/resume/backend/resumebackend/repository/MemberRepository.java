package com.resume.backend.resumebackend.repository;

import com.resume.backend.resumebackend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}