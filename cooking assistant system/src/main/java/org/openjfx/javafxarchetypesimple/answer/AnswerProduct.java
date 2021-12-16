package org.openjfx.javafxarchetypesimple.answer;

import org.openjfx.javafxarchetypesimple.Product;

public class AnswerProduct implements Answer<Product>{

    private Product product;

    public AnswerProduct(Product product){

        this.product = product;
    }

    @Override
    public Product getValue() {
        return product;
    }
}
