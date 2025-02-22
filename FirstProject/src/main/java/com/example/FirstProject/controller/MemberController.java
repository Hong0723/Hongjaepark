package com.example.FirstProject.controller;

import com.example.FirstProject.dto.MemberForm;
import com.example.FirstProject.entity.Member;
import com.example.FirstProject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
public class MemberController
{
    @Autowired
    private MemberRepository MemberRepository;

    @GetMapping("/members/new")
    public String newMemberForm() {
    return"members/new";
    }

    @PostMapping("/members/join")
    public String createMember(MemberForm form){
        log.info(form.toString());
        //System.out.println(form.toString());
        Member member = form.toEntity();
        //System.out.println(member.toString());
        log.info(member.toString());
        Member saved = MemberRepository.save(member);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }

    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model){
        log.info("id= " + id);
        Member memberEntity = MemberRepository.findById(id).orElse(null);
        model.addAttribute("member",memberEntity);
        return"members/show";
    }

    @GetMapping("/members")
    public String index(Model model){
        List<Member> memberEntityList = MemberRepository.findAll();
        model.addAttribute("memberList",memberEntityList);
        return"members/index";
    }

}
