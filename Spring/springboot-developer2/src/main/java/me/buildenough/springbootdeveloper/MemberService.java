package me.buildenough.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void test() {
        memberRepository.save(new Member(1L, "A"));
    }


}
