package com.example.awscodepipeline.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/status")
    public ResponseEntity getStatus(@RequestParam String name){

        return ResponseEntity.ok("Hello :"+name);
    }
}
