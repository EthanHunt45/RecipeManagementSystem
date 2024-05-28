package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.DefaultClasses.RecipeCard;
import DesignPatternsProject.SingletonPattern.RecipeBook;
import DesignPatternsProject.StrategyPattern.TotalRatingCompute;

import java.util.List;

public class ListRecipesCommand implements Command{
    static RecipeBook recipeBookSingleton = RecipeBook.getInstance();

    public static void listAllRecipes() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCard.printRecipeCard(recipe, i);
        }
    }

    public static void listAllRecipesForAverageRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCard.printRecipeForAverageRating(recipe);
        }
    }

    public static void listAllRecipesForTotalRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            recipe.setRatingComputationStrategy(new TotalRatingCompute());
            RecipeCard.printRecipeForAverageRating(recipe);
        }
    }
    @Override
    public void execute() {
        listAllRecipes();
    }
}
