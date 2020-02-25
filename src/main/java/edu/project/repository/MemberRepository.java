package edu.project.repository;

import edu.project.domain.MemberVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberVO, Long> {
    public MemberVO findByUserId(String userId);
}
