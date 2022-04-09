package com.qubitfaruk.cdi;

import com.qubitfaruk.ProductDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtutorial")
@ApplicationScoped
public class _04_New {
    @Produces
    public String uretilenData(@New ProductDto productDto){
        productDto= ProductDto.builder().productId(0L).productName("Ürün Adı").unitPrice(3500.0).build();
        return productDto.getProductName();
    }
    @Inject
    @Getter
    private String tuketilenData;

}
