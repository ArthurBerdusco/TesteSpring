package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String dados(){
        System.out.println("Funcionou SYSO");
        return "Funcionou";
    }

}
