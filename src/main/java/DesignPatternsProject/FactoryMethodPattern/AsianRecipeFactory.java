package DesignPatternsProject.FactoryMethodPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.SingletonPattern.RecipeBook;
import DesignPatternsProject.AbstractFactoryPattern.AsianStyleRecipe;

public class AsianRecipeFactory extends RecipeCreator{
    Recipe recipe;

    public AsianRecipeFactory() {
        super();
        System.out.println("Created Asian Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AsianStyleRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
