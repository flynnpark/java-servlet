package dev.flynnpark.servlet.web.frontcontroller.v3.controller;

import dev.flynnpark.servlet.domain.member.Member;
import dev.flynnpark.servlet.domain.member.MemberRepository;
import dev.flynnpark.servlet.web.frontcontroller.ModelView;
import dev.flynnpark.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView view = new ModelView("save-result");
        view.getModel().put("member", member);
        return view;
    }
}
