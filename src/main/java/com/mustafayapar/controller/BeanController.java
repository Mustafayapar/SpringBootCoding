package com.mustafayapar.controller;

import com.mustafayapar.bean.BeanConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;



    @GetMapping("/bean/beanDto") //http://localhost:8080/bean/beanDto
    @ResponseBody // html olmadan gösterir
    public String getBeanDto(){

        return beanConfig.beanDto() +".";
    }

}
