package org.openjfx.javafxarchetypesimple.development_3;

import org.openjfx.javafxarchetypesimple.recipe.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeRequirements {

    private Map<Recipe, List<KitchenAppliance>> requirements;

    public RecipeRequirements(){

        requirements = new HashMap<>();
    }

    public void addPair(Recipe recipe, List<KitchenAppliance> kitchenAppliances){

        requirements.put(recipe, kitchenAppliances);
    }

    public Map<Recipe, List<KitchenAppliance>> getRequirements() {
        return requirements;
    }
}
