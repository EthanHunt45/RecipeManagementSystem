package DesignPatternsProject.AbstractFactoryPattern;

import DesignPatternsProject.FactoryMethodPattern.RecipeStyles;

public class SpecialStyleRecipe extends Recipe {
    public SpecialStyleRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeStyles.SPECIAL_RECIPE);
    }
}
