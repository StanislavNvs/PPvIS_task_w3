package org.openjfx.javafxarchetypesimple.recipe;

import org.openjfx.javafxarchetypesimple.Eating;
import org.openjfx.javafxarchetypesimple.Product;

import java.util.List;

public class Recipe {

    private String name;
    private Eating eating;
    private List<Product> productList;
    private List<RecipeStep> steps;
    private RecipeStep currentStep;

    public Recipe(String name, Eating eating, List<Product> productList, List<RecipeStep> steps) throws Exception {

        if(steps.size() < 1){
            throw new Exception("Recipe could have at least 1 step");
        }
        this.name = name;
        this.eating = eating;
        this.productList = productList;
        this.steps = steps;
        currentStep = steps.get(0);
    }

    public Recipe(Recipe recipe){

        name = recipe.name;
        eating = recipe.eating;
        productList = recipe.productList;
        steps = recipe.steps;
        currentStep = recipe.currentStep;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<RecipeStep> getSteps() {
        return steps;
    }

    public RecipeStep getCurrentStep() {
        return currentStep;
    }

    public Eating getEating() {
        return eating;
    }

    public boolean nextStep(){

        if(currentStep == steps.get(steps.size()-1)){

            currentStep = steps.get(0);
            return false;
        }
        currentStep = steps.get(steps.indexOf(currentStep)+1);
        return true;
    }
}
