package DesignPatternsProject.FactoryMethodPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.SingletonPattern.RecipeBook;
import DesignPatternsProject.AbstractFactoryPattern.SpecialStyleRecipe;

public class SpecialRecipeFactory extends RecipeCreator {
    Recipe recipe;
    String name;
    public SpecialRecipeFactory(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new SpecialStyleRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}