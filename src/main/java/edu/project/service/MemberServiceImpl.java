package edu.project.service;

import edu.project.domain.MemberVO;
import edu.project.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /* 회원ID를 받아서 회원정보를 리턴해주는 함수 */
    public MemberVO getMember(String userId) {
        MemberVO memberVO = memberRepository.findByUserId(userId);
        return memberVO;
    }

    /* 회원 정보를 받아서 등록해주는 함수 */
    public Boolean insertMember(MemberVO memberVO) {
        try {
            MemberVO memberVO1 = memberRepository.save(memberVO);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
