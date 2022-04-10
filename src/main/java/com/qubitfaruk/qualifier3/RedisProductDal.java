package com.qubitfaruk.qualifier3;

import com.qubitfaruk.ProductDto;
@QualifierMultiple2(FazlaSecenek.THIRTH)
public class RedisProductDal implements ProductDal{
    @Override
    public String Add(ProductDto productDto) {
        return "Redis veritabanına eklendi "+productDto.getProductName();
    }
}
