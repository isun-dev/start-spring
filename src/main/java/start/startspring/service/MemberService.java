package start.startspring.service;

import start.startspring.repository.MemberRepository;
import start.startspring.repository.MemoryMemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
}
