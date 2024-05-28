package DesignPatternsProject.DefaultClasses;
import java.util.ArrayList;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;

public class RecipeCard {
    public static void printRecipeCard(Recipe recipe, int recipeIndex) {
        System.out.println("##########################################################");
        System.out.println("#              Recipe No: " +recipeIndex +
                "\n# Recipe Name: "+recipe.getName() +" from the "+ recipe.getType() +" Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : "+recipe.getAverageRating() );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   "+recipe.getDescription()                          );
        System.out.println("#                                                        #");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for "+recipe.getSize()+" people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipe.getCategories()                  );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        Tags: " + recipe.getTags()                        );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipe);
        System.out.println("#                                                        #");
        getInstructions(recipe);
        System.out.println("##########################################################");
    }

    //This method is used for printing the recipe card in the search results
    public static void printRecipeCard(Recipe recipe){
        System.out.println("##########################################################");
        System.out.println("#  "+recipe.getName() +" from the "+ recipe.getType() +" Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : "+recipe.getAverageRating() );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   "+recipe.getDescription()                          );
        System.out.println("#                                                        #");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for "+recipe.getSize()+" people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipe.getCategories()                  );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        Tags: " + recipe.getTags()                        );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipe);
        System.out.println("#                                                        #");
        getInstructions(recipe);
        System.out.println("##########################################################");
    }

    public static void printRecipeForAverageRating(Recipe recipe){
        System.out.println("##########################################################");
        System.out.println("#  Recipe Name: "+recipe.getName() +"      Rate: "+ recipe.getImpact()+ "  #");
        System.out.println("##########################################################");
    }

    private static void getIngredients(Recipe recipe) {
        for (Ingredient ingredient : recipe.getIngredients()) {
            System.out.println("#                                                        #");
            System.out.println("# "+ingredient.getName() + " " + ingredient.getAmount() + " " + ingredient.getUnit());
        }
    }

    private static void getInstructions(Recipe recipe) {
        System.out.println("#                      Instructions                      #");
        ArrayList<String> instructions = recipe.getInstructions();
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);
            System.out.println("#                                                        #");
            System.out.println("# " + (i+1) +" -> "+ instruction);
        }
    }
}
