package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.FactoryMethodPattern.RecipeCreator;
import java.util.Scanner;
import DesignPatternsProject.DefaultClasses.Category;
import DesignPatternsProject.DefaultClasses.Ingredient;
import DesignPatternsProject.DefaultClasses.Tag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CreateRecipeCommand implements Command {

    static Scanner scanner = new Scanner(System.in);
    public static void handleCreateRecipe(){
        System.out.println("<-------------------- Create Recipe --------------------> ");
        Recipe recipe = null;

        RecipeStyleCommand recipeStyleComponent = new RecipeStyleCommand();
        RecipeCreator recipeFactory = RecipeStyleCommand.getRecipeStyle();

        System.out.println("Please input the name of the recipe : ");
        String name = System.console().readLine();


        System.out.println("Please input the description of the recipe : ");
        String description = System.console().readLine();


        System.out.print("Please input the size of the recipe : ");
        int size = 0;

        while (true){
            try {
                size = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }


        try {
            recipe = recipeFactory.createRecipes(name, description, size);
            addCategories(recipe);
            addTags(recipe);
            addIngredients(recipe);
            addInstructions(recipe);
            System.out.println("Recipe created successfully!");
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }

    }

    private static Recipe addInstructions(Recipe recipe) {
        ArrayList<String> instructions = InstructionCommand.createInstructions();
        recipe.setInstructions(instructions);


        return recipe;
    }

    private static Recipe addIngredients(Recipe recipe) {
        List<Ingredient> ingredients = IngredientCommand.createIngredientList();

        for (Ingredient ingredient : ingredients) {
            recipe.addIngredient(ingredient);
        }

        return recipe;
    }

    private static Recipe addTags(Recipe recipe) {
        HashSet<Tag> tags = TagCommand.createTagList();

        for (Tag tag : tags) {
            recipe.addTag(tag);
        }
        return recipe;
    }

    private static Recipe addCategories(Recipe recipe) {
        HashSet<Category> categories = CategoryCommand.createCategoryList();

        for (Category category : categories) {
            recipe.addCategory(category);
        }
        return recipe;
    }
    @Override
    public void execute() {
        handleCreateRecipe();
    }
}
