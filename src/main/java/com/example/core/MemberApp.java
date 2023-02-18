package com.example.core;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import com.example.core.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("New Member : " + member.getName());
        System.out.println("Find Member : " + findMember.getName());

    }
}
