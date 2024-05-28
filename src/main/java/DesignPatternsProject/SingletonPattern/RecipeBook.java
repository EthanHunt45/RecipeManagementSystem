package DesignPatternsProject.SingletonPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import java.util.LinkedList;
import java.util.List;

public class RecipeBook{
    private static RecipeBook instance;
    private final List<Recipe> recipeList = new LinkedList<>();
    private RecipeBook() {
    }
    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

}