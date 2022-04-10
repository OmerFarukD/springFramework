package com.qubitfaruk.qualifier3;

import com.qubitfaruk.ProductDto;

import javax.enterprise.inject.Default;


@Default
public class MySqlProductDal implements ProductDal {
    @Override
    public String Add(ProductDto productDto) {
        return "Ürün Mysql veritabanına eklendi"+productDto.getProductName();
    }
}
