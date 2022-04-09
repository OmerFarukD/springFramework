package com.qubitfaruk.qualifier;

import com.qubitfaruk.ProductDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "businesRules")
@ApplicationScoped
public class ProductManager {
    @Inject
    @QualifierMultiple
    private ProductDal productDal;

    public String add(ProductDto productDto){
        return this.productDal.Add(productDto)+" İş katmanı ";
    }
}
