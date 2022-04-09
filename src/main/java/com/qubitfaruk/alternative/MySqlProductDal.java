package com.qubitfaruk.alternative;

import com.qubitfaruk.ProductDto;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;


@Alternative
public class MySqlProductDal implements ProductDal {
    @Override
    public String Add(ProductDto productDto) {
        return "Ürün Mysql veritabanına eklendi"+productDto.getProductName();
    }
}
