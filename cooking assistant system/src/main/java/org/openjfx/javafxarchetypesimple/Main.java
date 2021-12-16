package org.openjfx.javafxarchetypesimple;

import org.openjfx.javafxarchetypesimple.answer.AnswerEating;
import org.openjfx.javafxarchetypesimple.answer.AnswerProduct;
import org.openjfx.javafxarchetypesimple.question.EatingQuestion;
import org.openjfx.javafxarchetypesimple.question.ProductQuestion;
import org.openjfx.javafxarchetypesimple.question.Questionnaire;
import org.openjfx.javafxarchetypesimple.question.QuestionsHandler;
import org.openjfx.javafxarchetypesimple.recipe.Recipe;
import org.openjfx.javafxarchetypesimple.recipe.RecipeStep;
import org.openjfx.javafxarchetypesimple.system.CookingAssistantSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {

        Product banana = new Product("banana");
        Product milk = new Product("milk");
        Product chocolate = new Product("chocolate");

        List<Product> products = new ArrayList<>();
        products.add(banana);
        products.add(milk);
        products.add(chocolate);

        HashMap<Product, Integer> requirements1 = new HashMap<>();
        requirements1.put(banana, 2);
        HashMap<Product, Integer> requirements2 = new HashMap<>();
        requirements2.put(milk, 1);
        HashMap<Product, Integer> requirements3 = new HashMap<>();
        requirements3.put(chocolate, 1);


        RecipeStep recipeStep1 = new RecipeStep("Превратить бананы в пюре в блендере", requirements1);
        RecipeStep recipeStep2 = new RecipeStep("Растопить шоколад на водяной бане", requirements2);
        RecipeStep recipeStep3 = new RecipeStep("Добавить банановое пюре и растопленный шоколад в молоко и перемешать", requirements3);

        List<RecipeStep> steps = new ArrayList<>(4);
        steps.add(recipeStep1);
        steps.add(recipeStep2);
        steps.add(recipeStep3);

        Recipe recipe1 = new Recipe("recipe1", Eating.BREAKFAST, products, steps);


        List<Recipe> recipes = new ArrayList<>();
        recipes.add(recipe1);

        EatingQuestion firstQuestion = new EatingQuestion("готовим завтрак, обед или ужин?");
        ProductQuestion secondQuestion = new ProductQuestion("какой один продукт должен быть обязательно в рецепте?");
        CookingAssistantSystem cookingAssistantSystem = new CookingAssistantSystem(recipes, products,
                recipe1);
        cookingAssistantSystem.setProducts(products);
        cookingAssistantSystem.setRecipeList(recipes);
        cookingAssistantSystem.setCurrentRecipe(recipe1);
        AnswerEating answerEating = new AnswerEating(Eating.BREAKFAST);
        AnswerProduct answerProduct = new AnswerProduct(banana);
        Questionnaire questionnaire = new Questionnaire(firstQuestion, secondQuestion, answerEating, answerProduct);
        questionnaire.init();
        cookingAssistantSystem.setQuestionnaire(questionnaire);
        QuestionsHandler questionsHandler = new QuestionsHandler(firstQuestion, secondQuestion, cookingAssistantSystem.getRecipeList());
        cookingAssistantSystem.setQuestionsHandler(questionsHandler);
        List<Recipe> suggestedRecipes = cookingAssistantSystem.getSuggestedRecipes();
        cookingAssistantSystem.setCurrentRecipe(suggestedRecipes.get(0));
        boolean flag = true;
        while(flag){

            String step = cookingAssistantSystem.getStep();
            if(step != null){

                System.out.println(step);
            }

            else flag = false;
        }
    }
}