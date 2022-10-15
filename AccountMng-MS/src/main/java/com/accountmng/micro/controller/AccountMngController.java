package com.accountmng.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountMngController {

    @GetMapping("/check")
    private String check() {
        return "Good Morning!";
    }
}
