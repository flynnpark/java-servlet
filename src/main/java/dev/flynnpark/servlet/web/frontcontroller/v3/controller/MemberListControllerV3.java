package dev.flynnpark.servlet.web.frontcontroller.v3.controller;

import dev.flynnpark.servlet.domain.member.Member;
import dev.flynnpark.servlet.domain.member.MemberRepository;
import dev.flynnpark.servlet.web.frontcontroller.ModelView;
import dev.flynnpark.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelView view = new ModelView("members");
        view.getModel().put("members", members);
        return view;
    }
}
