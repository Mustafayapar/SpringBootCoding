package com.mustafayapar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TymeleafController {


    //http://localhost:8080/tymeleaf1
    @GetMapping("/tymeleaf1")
    public String getTymeleaf() {

        return "tymeleaf1";
    }
}
