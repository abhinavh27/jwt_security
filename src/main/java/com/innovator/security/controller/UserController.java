package com.innovator.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/")
public class UserController {

    @GetMapping("/userEndpoint")
    public ResponseEntity<String> someMethod(){
        return ResponseEntity.ok("Only the person who has user role in Db can access this");
    }
}
