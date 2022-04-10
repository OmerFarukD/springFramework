package com.qubitfaruk.qualifier3;

import com.qubitfaruk.ProductDto;


@QualifierMultiple2(FazlaSecenek.FIRST)
public class PostgreSqlProductDal implements ProductDal {
    @Override
    public String Add(ProductDto productDto) {
        return "Ürün postgreSql veritabanına eklendi." +productDto.getProductName();
    }
}
