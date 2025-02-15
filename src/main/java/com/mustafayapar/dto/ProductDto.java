package com.mustafayapar.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class ProductDto extends BaseDto {

    private int productId;
    private String productName;
    private long productPrice;
}
