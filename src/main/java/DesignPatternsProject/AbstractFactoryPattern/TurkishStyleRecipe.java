package DesignPatternsProject.AbstractFactoryPattern;

import DesignPatternsProject.FactoryMethodPattern.RecipeStyles;

public class TurkishStyleRecipe extends Recipe{
    public TurkishStyleRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeStyles.TURKISH_RECIPE);
    }
}
