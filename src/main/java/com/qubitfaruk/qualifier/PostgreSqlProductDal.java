package com.qubitfaruk.qualifier;

import com.qubitfaruk.ProductDto;



@QualifierMultiple
public class PostgreSqlProductDal implements ProductDal {
    @Override
    public String Add(ProductDto productDto) {
        return "Ürün postgreSql veritabanına eklendi." +productDto.getProductName();
    }
}
