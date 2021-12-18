package org.openjfx.javafxarchetypesimple.development_3;

import org.openjfx.javafxarchetypesimple.development_2_and_7.Allergy;
import org.openjfx.javafxarchetypesimple.development_2_and_7.CountQuestion;
import org.openjfx.javafxarchetypesimple.development_2_and_7.ImprovedQuestionsHandler;
import org.openjfx.javafxarchetypesimple.question.EatingQuestion;
import org.openjfx.javafxarchetypesimple.question.ProductQuestion;
import org.openjfx.javafxarchetypesimple.recipe.Recipe;

import java.util.List;

public class ExtendedQuestionsHandler extends ImprovedQuestionsHandler {

    RecipeRequirements recipeRequirements;
    List<KitchenAppliance> kitchenAppliances;

    public ExtendedQuestionsHandler(EatingQuestion firstQuestion, ProductQuestion secondQuestion,
                                    CountQuestion thirdQuestion, List<Allergy> allergies,
                                    List<Recipe> recipes, RecipeRequirements recipeRequirements,
                                    List<KitchenAppliance> kitchenAppliances) {
        super(firstQuestion, secondQuestion, thirdQuestion, allergies, recipes);

        this.recipeRequirements = recipeRequirements;
        this.kitchenAppliances = kitchenAppliances;
    }

    @Override
    public List<Recipe> getSuggestedRecipes(){

        List<Recipe> suggestedRecipes = super.getSuggestedRecipes();

        suggestedRecipes.removeIf(recipe -> !kitchenAppliances.containsAll(recipeRequirements.getRequirements().get(recipe)));

        return suggestedRecipes;
    }
}
