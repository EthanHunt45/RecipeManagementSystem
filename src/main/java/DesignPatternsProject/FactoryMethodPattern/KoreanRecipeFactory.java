package DesignPatternsProject.FactoryMethodPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.SingletonPattern.RecipeBook;
import DesignPatternsProject.AbstractFactoryPattern.KoreanStyleRecipe;

public class KoreanRecipeFactory extends RecipeCreator{
    Recipe recipe;

    public KoreanRecipeFactory() {
        super();
        System.out.println("Created Asian Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new KoreanStyleRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
