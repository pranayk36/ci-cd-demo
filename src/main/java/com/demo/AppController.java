package com.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
