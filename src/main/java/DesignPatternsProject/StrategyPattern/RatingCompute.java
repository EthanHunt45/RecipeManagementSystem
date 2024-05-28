package DesignPatternsProject.StrategyPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;

public interface RatingCompute {
    void updateRatings(Recipe recipe, int rating);
    double computeImpact(Recipe recipe);
}
