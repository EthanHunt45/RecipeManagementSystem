package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.SingletonPattern.RecipeBook;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import java.util.List;

public class SelectRecipeCommand implements Command {
    public static Recipe selectRecipe() {
        RecipeBook recipeBookSingleton = RecipeBook.getInstance();
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;

        ListRecipesCommand.listAllRecipes();
        System.out.println("Select the recipe you want (Enter Recipe No): ");
        int choice;

        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());

                if(choice < recipeList.size() && choice >= 0)
                    break;
                else
                    System.out.println("Invalid choice, please try again.");

            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        recipe = recipeList.get(choice);

        return recipe;
    }
    @Override
    public void execute() {
        selectRecipe();
    }
}
