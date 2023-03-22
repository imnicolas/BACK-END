package com.porta.portafolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/testing")
    public String helloWorld() {
        return "Hello World!";
    }
}
