package com.mustafayapar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TymeleafController {


    //http://localhost:8080/tymeleaf1
    @GetMapping("/tymeleaf1")
    public String getTymeleaf() {

        return "tymeleaf1";
    }

    //http://localhost:8080/tymeleaf2
    @GetMapping("/tymeleaf2")
    public String getThymeleaf2Model(Model model) {

        model.addAttribute("key_model" , "ben modelden geldim");
        return "tymeleaf1";
    }

    //http://localhost:8080/tymeleaf3
    @GetMapping("/tymeleaf3")
    public String getThymeleaf3Model(Model model) {

        model.addAttribute("key_model" , "ben modelden geldim");
        return "tyhmwleaf_file/tymeleaf1";
    }


}
