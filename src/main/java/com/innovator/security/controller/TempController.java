package com.innovator.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/temp")
public class TempController {

    @GetMapping("/blah")
    public ResponseEntity<String> someMethod(){
        return ResponseEntity.ok("Only the person who has temp role in Db can access this");
    }
}
