package DesignPatternsProject.StrategyPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;

public class AverageRatingCompute implements RatingCompute {
    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
        recipe.setAverageRating((recipe.getAverageRating() * (recipe.getTotalRatings() - 1) + rating) / recipe.getTotalRatings());
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getAverageRating();
    }
}