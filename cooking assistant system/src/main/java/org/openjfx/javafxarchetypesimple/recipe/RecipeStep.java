package org.openjfx.javafxarchetypesimple.recipe;

import org.openjfx.javafxarchetypesimple.Product;

import java.util.Map;

public class RecipeStep{

    private String stepText;
    private Map<Product, Integer> productsAndTheirCount;

    public RecipeStep(String stepText, Map<Product, Integer> productsAndTheirCount){

        this.stepText = stepText;
        this.productsAndTheirCount = productsAndTheirCount;
    }

    public String getStepText() {
        return stepText;
    }

    public Map<Product, Integer> getProductsAndTheirCount() {
        return productsAndTheirCount;
    }
}
