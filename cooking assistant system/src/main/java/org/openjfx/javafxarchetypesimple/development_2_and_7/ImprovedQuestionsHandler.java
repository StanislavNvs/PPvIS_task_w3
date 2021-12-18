package org.openjfx.javafxarchetypesimple.development_2_and_7;

import org.openjfx.javafxarchetypesimple.Product;
import org.openjfx.javafxarchetypesimple.question.EatingQuestion;
import org.openjfx.javafxarchetypesimple.question.ProductQuestion;
import org.openjfx.javafxarchetypesimple.question.QuestionsHandler;
import org.openjfx.javafxarchetypesimple.recipe.Recipe;
import org.openjfx.javafxarchetypesimple.recipe.RecipeStep;

import java.util.List;
import java.util.Map;

public class ImprovedQuestionsHandler extends QuestionsHandler {

    CountQuestion thirdQuestion;
    List<Allergy> allergies;

    public ImprovedQuestionsHandler(EatingQuestion firstQuestion, ProductQuestion secondQuestion,
                                    CountQuestion thirdQuestion, List<Allergy> allergies, List<Recipe> recipes) {
        super(firstQuestion, secondQuestion, recipes);

        this.thirdQuestion = thirdQuestion;
        this.allergies = allergies;
    }

    @Override
    public List<Recipe> getSuggestedRecipes(){

        List<Recipe> suggestedRecipes = super.getSuggestedRecipes();

        for(Recipe recipe: suggestedRecipes){

            for(RecipeStep recipeStep: recipe.getSteps()){

                for(Map.Entry<Product, Integer> entry: recipeStep.getProductsAndTheirCount().entrySet()){

                    entry.setValue(entry.getValue()*thirdQuestion.getAnswer().getValue());
                }
            }
        }

        for(Recipe recipe: suggestedRecipes){

            for(Product product: recipe.getProductList()){

                for(Allergy allergy: allergies){

                    if(allergy.getProduct().getName().equals(product.getName())){

                        suggestedRecipes.remove(recipe);
                    }
                }
            }
        }

        return suggestedRecipes;
    }
}
