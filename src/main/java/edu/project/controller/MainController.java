package edu.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String rootFunction() {
        logger.info("---------------------------");
        logger.info("TESTTESTTEST111222222테스트입니다!!!!!!!!!!!!!!!!!!!!!!!!!");
        logger.info("---------------------------");
        return "SUCCESS";
    }
}
