package DesignPatternsProject.AbstractFactoryPattern;
import java.util.*;
import DesignPatternsProject.DefaultClasses.Category;
import DesignPatternsProject.DefaultClasses.Ingredient;
import DesignPatternsProject.DefaultClasses.Tag;
import DesignPatternsProject.StrategyPattern.RatingCompute;
import DesignPatternsProject.StrategyPattern.AverageRatingCompute;
import DesignPatternsProject.FactoryMethodPattern.RecipeStyles;

public abstract class Recipe {

    private String name;

    private String description;

    private int size;

    private RecipeStyles type;

    private final List<Ingredient> ingredients = new LinkedList<>();

    private final Set<Category> categories = new HashSet<>(3);

    private final Set<Tag> tags = new HashSet<>(3);

    private ArrayList<String> instructions = new ArrayList<>();



    private RatingCompute ratingComputationStrategy;
    private int totalRatings;
    private double averageRating;

    public Recipe(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
        ratingComputationStrategy = new AverageRatingCompute();
        categories.add(Category.NONE);
    }

    public void setRatingComputationStrategy(RatingCompute strategy) {
        ratingComputationStrategy = strategy;
    }

    public void addRating(int rating) {
        ratingComputationStrategy.updateRatings(this, rating);
    }

    public double getImpact() {
        return ratingComputationStrategy.computeImpact(this);
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }




    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addCategory(Category category) {
        categories.remove(Category.NONE);

        if (categories.size() < 3) {
            categories.add(category);
        } else {
            System.out.println("You can't add more than 3 categories");
        }

    }

    public void addTag(Tag tag) {
        if (tags.size() < 3) {
            tags.add(tag);
        } else {
            System.out.println("You can't add more than 3 tags");
        }
    }

    public void setCategories(HashSet<Category> categories) {
        this.categories.clear();
        this.categories.addAll(categories);
    }

    public void setTags(HashSet<Tag> tags) {
        this.tags.clear();
        this.tags.addAll(tags);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients.clear();
        this.ingredients.addAll(ingredients);
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public RecipeStyles getType() {
        return type;
    }

    public void setType(RecipeStyles type) {
        this.type = type;
    }
}
