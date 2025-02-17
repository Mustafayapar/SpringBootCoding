package com.mustafayapar.controller;

import com.mustafayapar.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {

        model.addAttribute("key_model" , "ben modelden geldim");
        return "tyhmeleaf_file/thymeleaf3";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {

        model.addAttribute("key_model" , "ben modelden geldim 4");
        return "thymeleaf4";
    }
///////////////////////////////////////////////////////////////////////

    //Model object gönderme
//http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model", "text");

        ProductDto productDto = new ProductDto()
                .builder()
                .productId(0)
                .productName("ürün adı")
                .productPrice(2560)
                .build();
        model.addAttribute("productDto", productDto);
    return "thymeleaf5";
}


    //Model List gönderme
//http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6ModelList(Model model) {
        model.addAttribute("key_model", "text");
        List<ProductDto> list = new ArrayList<>();
        list.add(ProductDto.builder().productId(1).productName("ürün adı").productPrice(2560).build());
        list.add(ProductDto.builder().productId(2).productName("ürün adı").productPrice(2560).build());
        list.add(ProductDto.builder().productId(3).productName("ürün adı").productPrice(2560).build());
        list.add(ProductDto.builder().productId(4).productName("ürün adı").productPrice(2560).build());

        model.addAttribute("product_liste", list);
        return "thymeleaf6";
    }

    //http://localhost:8080/thymeleaf8?id=4
    @GetMapping("/thymeleaf8")
    public String getThymeleaf8RequestParam(Model model, @RequestParam(name = "id", required = false) Long id) {
        if(id!=null){
            model.addAttribute("key_model", "id" + id);
        }
        else {
            model.addAttribute("key_model", "id bulunamadı");
        }
        return "thymeleaf8";
    }

}
