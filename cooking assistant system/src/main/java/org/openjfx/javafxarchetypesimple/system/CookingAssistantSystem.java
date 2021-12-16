package org.openjfx.javafxarchetypesimple.system;

import org.openjfx.javafxarchetypesimple.Product;
import org.openjfx.javafxarchetypesimple.question.Questionnaire;
import org.openjfx.javafxarchetypesimple.question.QuestionsHandler;
import org.openjfx.javafxarchetypesimple.recipe.Recipe;
import org.openjfx.javafxarchetypesimple.recipe.RecipeStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CookingAssistantSystem {

    private List<Recipe> recipeList;
    private List<Product> products;
    private Recipe currentRecipe;
    private Questionnaire questionnaire;
    private QuestionsHandler questionsHandler;

    public CookingAssistantSystem(List<Recipe> recipeList, List<Product> products, Recipe currentRecipe)
    {

        this.recipeList = recipeList;
        this.products = products;
        this.currentRecipe = currentRecipe;
    }



    public List<Product> missingProducts(){

        List<Product> missingProducts = new ArrayList<>(currentRecipe.getProductList());

        for(Product product: currentRecipe.getProductList()){

            for(Product product1: products){

                if(product == product1){

                    missingProducts.remove(product);
                }
            }
        }

        return missingProducts;
    }

    public void addProducts(List<Product> newProducts){

        products.addAll(newProducts);
    }

    public void continueCurrentRecipe(){}

    public void getAnswers(){


    }

    public List<Recipe> getSuggestedRecipes(){

        return questionsHandler.getSuggestedRecipes();
    }

    public void chooseRecipe(Recipe recipe){

        this.currentRecipe = recipe;
    }

    public String getStep(){

        if(currentRecipe == null){

            return null;
        }

        RecipeStep recipeStep = currentRecipe.getCurrentStep();
        if(!currentRecipe.nextStep()){

            currentRecipe = null;
        }

        String productsAndCount = "";
        for(Map.Entry<Product, Integer> entry: recipeStep.getProductsAndTheirCount().entrySet()){

            productsAndCount+=entry.getKey().getName() + " ";
            productsAndCount+=entry.getValue();
        }
        return recipeStep.getStepText() + " " + productsAndCount;
    }


    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setCurrentRecipe(Recipe currentRecipe) {
        this.currentRecipe = currentRecipe;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Recipe getCurrentRecipe() {
        return currentRecipe;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public QuestionsHandler getQuestionsHandler() {
        return questionsHandler;
    }

    public void setQuestionsHandler(QuestionsHandler questionsHandler) {
        this.questionsHandler = questionsHandler;
    }
}
