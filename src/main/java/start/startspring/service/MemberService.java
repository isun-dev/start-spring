package start.startspring.service;

import start.startspring.domain.Member;
import start.startspring.repository.MemberRepository;
import start.startspring.repository.MemoryMemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원가입
     */
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }
}
