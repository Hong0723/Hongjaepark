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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller
public class MemberController
{
    @Autowired
    private MemberRepository memberRepository;

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
        Member saved = memberRepository.save(member);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "redirect:/members/"+ saved.getId();
    }

    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model){
        log.info("id= " + id);
        Member memberEntity = memberRepository.findById(id).orElse(null);
        model.addAttribute("member",memberEntity);
        return"members/show";
    }

    @GetMapping("/members")
    public String index(Model model){
        List<Member> memberEntityList = memberRepository.findAll();
        model.addAttribute("memberList",memberEntityList);
        return"members/index";
    }

    @GetMapping("/members/{id}/edit")
    public String edit(@PathVariable Long id,Model model){
        Member memberEntity = memberRepository.findById(id).orElse(null);
        model.addAttribute("member",memberEntity);
        return"members/edit";
}

    @PostMapping("/members/update")
        public String update(MemberForm form){
        log.info(form.toString());
        Member memberEntity= form.toEntity();
        log.info(memberEntity.toString());
        Member target = memberRepository.findById(memberEntity.getId()).orElse(null);
        if(target != null){
            memberRepository.save(memberEntity);
        }
        return"redirect:/members/" + memberEntity.getId();
        }

    @GetMapping("members/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr1){
        log.info("삭제 요청이 들어왔습니다!!");
        Member target = memberRepository.findById(id).orElse(null);
        log.info(target.toString());
        if(target != null){
            memberRepository.delete(target);
            rttr1.addFlashAttribute("msg","삭제됐습니다!!!");
        }
        return "redirect:/members";
    }
}

