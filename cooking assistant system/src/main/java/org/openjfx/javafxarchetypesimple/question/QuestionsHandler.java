package org.openjfx.javafxarchetypesimple.question;


import org.openjfx.javafxarchetypesimple.recipe.Recipe;

import java.util.ArrayList;
import java.util.List;

public class QuestionsHandler {

    private EatingQuestion firstQuestion;
    private ProductQuestion secondQuestion;
    private List<Recipe> recipes;

    public QuestionsHandler(EatingQuestion firstQuestion, ProductQuestion secondQuestion, List<Recipe> recipes){

        this.firstQuestion = firstQuestion;
        this.secondQuestion = secondQuestion;
        this.recipes = recipes;
    }

    public List<Recipe> getSuggestedRecipes(){

        List<Recipe> suggestedRecipes = new ArrayList<>(recipes);


        suggestedRecipes.removeIf(recipe -> firstQuestion.getAnswer().getValue() != recipe.getEating());

        suggestedRecipes.removeIf(recipe -> !recipe.getProductList().contains(secondQuestion.getAnswer().getValue()));

        return suggestedRecipes;
    }
}
