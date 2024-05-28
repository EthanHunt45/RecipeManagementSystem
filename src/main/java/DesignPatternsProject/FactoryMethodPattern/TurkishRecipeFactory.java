package DesignPatternsProject.FactoryMethodPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.AbstractFactoryPattern.TurkishStyleRecipe;
import DesignPatternsProject.SingletonPattern.RecipeBook;

public class TurkishRecipeFactory extends RecipeCreator{
    Recipe recipe;
    public TurkishRecipeFactory() {
        super();
        System.out.println("Created Turkish Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new TurkishStyleRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
