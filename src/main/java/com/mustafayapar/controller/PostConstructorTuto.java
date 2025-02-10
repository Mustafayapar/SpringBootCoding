package com.mustafayapar.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;


@Controller
public class PostConstructorTuto {

//    @Autowired
//    Logger LOG;

    //    public PostConstructorTuto() {
//        LOG.info("Log info");
//    }
//    @PostConstruct
//    public void init(){
//        LOG.info("Log info");
//    }
    public static void main(String[] args) {
        BeanController beanController = new BeanController();
        System.out.println(beanController);
    }
}
