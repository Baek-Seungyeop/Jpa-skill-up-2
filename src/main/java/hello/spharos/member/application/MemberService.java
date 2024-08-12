package hello.spharos.member.application;

import hello.spharos.member.domain.Member;
import hello.spharos.member.dto.MemberSignUpDto;

public interface MemberService {

    void signUp(MemberSignUpDto memberSignUpDto);
    Member getMemberById(Long id);
    Member getMemberByEmail(String email);
}