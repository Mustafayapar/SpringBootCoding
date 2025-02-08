package com.mustafayapar.bean;

import com.mustafayapar.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton")
//    @Scope("request")
//    @Scope("session")
    public BeanDto beanDto() {
        return BeanDto
                .builder()
                .id(0L).beanName("bean Name").beanData("data bean")
                .build();
    }
}
