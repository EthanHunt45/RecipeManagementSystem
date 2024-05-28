package DesignPatternsProject.FactoryMethodPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;

public abstract class RecipeCreator {
    public abstract Recipe createRecipes(String name, String description, int size);
}
