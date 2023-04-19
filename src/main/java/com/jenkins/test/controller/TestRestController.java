package com.jenkins.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v1/")
public class TestRestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Hi User, Welcome to SpringBoot Sample Rest App";
    }
}
