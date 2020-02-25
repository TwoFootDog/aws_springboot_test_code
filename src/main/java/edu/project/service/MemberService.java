package edu.project.service;

import edu.project.domain.MemberVO;

public interface MemberService {
    public MemberVO getMember(String userId);
    public Boolean insertMember(MemberVO member);
}
