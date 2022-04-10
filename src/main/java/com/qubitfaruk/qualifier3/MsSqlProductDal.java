package com.qubitfaruk.qualifier3;

import com.qubitfaruk.ProductDto;
@QualifierMultiple2(FazlaSecenek.SECOND)
public class MsSqlProductDal implements ProductDal{
    @Override
    public String Add(ProductDto productDto) {
        return "MsSql Veritabanına eklendi "+productDto.getProductName();
    }
}
