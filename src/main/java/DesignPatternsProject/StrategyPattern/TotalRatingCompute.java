package DesignPatternsProject.StrategyPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;

public class TotalRatingCompute implements RatingCompute{
    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getTotalRatings();
    }
}
