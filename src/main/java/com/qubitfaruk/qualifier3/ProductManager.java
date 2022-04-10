package com.qubitfaruk.qualifier3;

import com.qubitfaruk.ProductDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.groups.Default;

@Named(value = "businesRules3")
@ApplicationScoped
public class ProductManager {
    @Inject
    @QualifierMultiple2(FazlaSecenek.FIRST)
    private ProductDal productDal;

    public String add(ProductDto productDto){
        return this.productDal.Add(productDto)+" İş katmanı ";
    }
}
