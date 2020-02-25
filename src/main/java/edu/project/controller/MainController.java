package edu.project.controller;

import edu.project.domain.MemberVO;
import edu.project.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);

    private final MemberService memberService;
    @Autowired
    public MainController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String rootFunction() {
        logger.info("---------------------------");
        logger.info("TEST");
        logger.info("---------------------------");
        return "Main Page";
    }

    @GetMapping("/member/{userId}")
    public MemberVO getMember(@PathVariable("userId")  String userId) {
        return memberService.getMember(userId);
    }

    @PostMapping("/member")
    public Boolean insertMember(@RequestBody MemberVO memberVO) {
        return memberService.insertMember(memberVO);
    }
}
