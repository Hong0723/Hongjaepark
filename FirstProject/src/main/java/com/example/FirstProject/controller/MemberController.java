package com.example.FirstProject.controller;

import com.example.FirstProject.dto.MemberForm;
import com.example.FirstProject.entity.Member;
import com.example.FirstProject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController
{
    @Autowired
    private  MemberRepository MemberRepository;

    @GetMapping("/members/new")
    public String newMemberForm() {
    return"members/new";
    }

    @PostMapping("/members/join")
    public String createMember(MemberForm form){
        System.out.println(form.toString());
        Member member = form.toEntity();
        System.out.println(member.toString());
        Member saved = MemberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
}
