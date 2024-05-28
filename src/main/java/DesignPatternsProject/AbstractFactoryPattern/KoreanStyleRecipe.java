package DesignPatternsProject.AbstractFactoryPattern;
import DesignPatternsProject.FactoryMethodPattern.RecipeStyles;

public class KoreanStyleRecipe extends Recipe {
    public KoreanStyleRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeStyles.KOREAN_RECIPE);
    }
}
