package com.mustafayapar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Log4j2
@NoArgsConstructor
@Builder(builderClassName = "Builder", toBuilder = true)
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    //Başlangıç
    public void initialBeanMethod(){
        log.info("BeanDto initialBeanMethod bean başlamadan önce çalışır.");
        System.out.println("bean başlamadan önce ben varım");

    }


    //Bitiş
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra destroybean vardır. ");
        System.err.println("bean bittikten sonra destroybean vard");
    }

}
