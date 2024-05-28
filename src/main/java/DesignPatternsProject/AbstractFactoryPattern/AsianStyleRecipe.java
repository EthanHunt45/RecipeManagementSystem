package DesignPatternsProject.AbstractFactoryPattern;
import DesignPatternsProject.FactoryMethodPattern.RecipeStyles;

public class AsianStyleRecipe extends Recipe {
    public AsianStyleRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeStyles.ASIAN_RECIPE);
    }
}