package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import DesignPatternsProject.DefaultClasses.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModificationCommand implements Command{
    private Recipe recipe = selectRecipeToModify();

    public void  handleModifyRecipe() {
        System.out.println("----------------- Modify Recipe ----------------");
        System.out.println("|   1. Modify Recipe Name                      |");
        System.out.println("|   2. Modify Recipe Description               |");
        System.out.println("|   3. Modify Recipe Service Size              |");
        System.out.println("|   4. Modify Recipe Ingredients               |");
        System.out.println("|   5. Modify Recipe Instructions              |");
        System.out.println("|   6. Modify Recipe Categories                |");
        System.out.println("|   7. Modify Recipe Tags                      |");
        System.out.println("|   8. Exit                                    |");
        System.out.println("------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice;
        while(true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }
        switch (choice) {
            case 1:
                // handle option 1
                System.out.println("Modify Recipe Name selected");
                modifyRecipeName();
                break;
            case 2:
                // handle option 2
                System.out.println("Modify Recipe Description selected");
                modifyRecipeDescription();
                break;
            case 3:
                // handle option 3
                System.out.println("Modify Recipe Service Size selected");
                modifyRecipeServiceSize();
                break;
            case 4:
                // handle option 4
                System.out.println("Modify Recipe Ingredients selected");
                modifyRecipeIngredients();
                break;
            case 5:
                // handle option 5
                System.out.println("Modify Recipe Instructions selected");
                modifyRecipeInstructions();
                break;
            case 6:
                // handle option 6
                System.out.println("Modify Recipe Categories selected");
                modifyRecipeCategories();
                break;
            case 7:
                // handle option 7
                System.out.println("Modify Recipe Tags selected");
                modifyRecipeTags();
                break;
            case 8:
                // quit the program
                System.out.println("Quitting Recipe Modification...");
                MainPage.mainPage.showMainPage();
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }

    private  void modifyRecipeTags() {
        HashSet<Tag> tags = TagCommand.createTagList();

        HashSet<Tag> oldTags = new HashSet<>();
        for (Tag tag : recipe.getTags()) {
            oldTags.add(tag);
            recipe.removeTag(tag);
        }
        for(Tag tag : tags){
            recipe.addTag(tag);
        }

        //modifyRecipe.modifyRecipeTags(tags);
        //düzenledik

        System.out.println("Recipe tags modified successfully " );
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification(oldTags, "tags");

    }

    private  void modifyRecipeCategories() {
        HashSet<Category> categories = CategoryCommand.createCategoryList();

        HashSet<Category> oldCategories = new HashSet<>();

        for (Category category : recipe.getCategories()) {
            oldCategories.add(category);
            recipe.removeCategory(category);
        }
        for(Category category : categories){
            recipe.addCategory(category);
        }

        //modifyRecipe.modifyRecipeCategories(categories);

        System.out.println("Recipe categories modified successfully " );
        RecipeCard.printRecipeCard(recipe);

        undoModification( oldCategories, "categories");
    }


    private  void modifyRecipeInstructions() {
        ArrayList<String> instructions = InstructionCommand.createInstructions();

        ArrayList<String> oldInstructions = recipe.getInstructions();

        recipe.setInstructions(instructions);

        //modifyRecipe.modifyRecipeInstructions(instructions);

        System.out.println("Recipe instructions modified successfully " );
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification( oldInstructions, "instructions");
    }

    private  void modifyRecipeIngredients() {
        List<Ingredient> ingredients = IngredientCommand.createIngredientList();

        List<Ingredient> oldIngredients = recipe.getIngredients();

        //modifyRecipe.modifyRecipeIngredients(ingredients);
        recipe.setIngredients(ingredients);

        System.out.println("Recipe ingredients modified successfully " );
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification(oldIngredients, "ingredients");
    }

    private  void modifyRecipeServiceSize() {
        System.out.println("Enter new service size: ");

        int oldServiceSize = recipe.getSize();

        int newServiceSize = 0;
        try {
            newServiceSize = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }
        //modifyRecipe.modifyRecipeSize(newServiceSize);

        recipe.setSize(newServiceSize);

        System.out.println("Recipe service size changed to: " + recipe.getSize());
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification( oldServiceSize, "size");
    }

    private  void modifyRecipeDescription() {
        System.out.println("Enter new description: ");

        String oldDescription = recipe.getDescription();

        String newDescription = System.console().readLine();
        //modifyRecipe.modifyRecipeDescription(newDescription);

        recipe.setDescription(newDescription);

        System.out.println("Recipe description changed to: " + recipe.getDescription());
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification(oldDescription, "description");
    }

    private  void modifyRecipeName() {
        System.out.println("Enter new name: ");

        String oldName = recipe.getName();

        String newName = System.console().readLine();
        //modifyRecipe.modifyRecipeName(newName);
        recipe.setName(newName);
        System.out.println("Recipe name changed to: " + recipe.getName());
        System.out.println("Here is your new recipe: ");
        RecipeCard.printRecipeCard(recipe);
        undoModification(oldName, "name");
    }

    private  void undoModification(Object a, String type) {
        System.out.println("Do you want to undo the modification? (y/n)");
        String choice = System.console().readLine().toLowerCase();

        if(choice.startsWith("y")) {
            System.out.println("Undoing modification...");

            switch (type){
                case "name":
                    //modifyRecipe.modifyRecipeName((String) a);
                    recipe.setName((String)a);
                    break;
                case "description":
                    //ModifyRecipe.modifyRecipeDescription((String) a);
                    recipe.setDescription((String)a);
                    break;
                case "size":
                    //ModifyRecipe.modifyRecipeSize((int) a);
                    recipe.setSize((int)a);
                    break;
                case "ingredients":
                    //modifyRecipe.modifyRecipeIngredients((HashSet<Ingredient>) a);
                    recipe.setIngredients((List<Ingredient>) a);
                    break;
                case "instructions":
                    //modifyRecipe.modifyRecipeInstructions((ArrayList<String>) a);
                    recipe.setInstructions((ArrayList<String>) a);
                    break;
                case "categories":
                    //ModifyRecipe.modifyRecipeCategories((HashSet<Category>) a);
                    recipe.setCategories((HashSet<Category>) a);
                    break;
                case "tags":
                    //ModifyRecipe.modifyRecipeTags((HashSet<Tag>) a);
                    recipe.setTags((HashSet<Tag>) a);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;

            }
            RecipeCard.printRecipeCard(recipe);
        } else if(choice.startsWith("n")) {
            System.out.println("Modification saved.");
        } else {
            System.out.println("Invalid choice, please try again.");
            undoModification(a, type);
        }
    }
    private  Recipe selectRecipeToModify() {
        return SelectRecipeCommand.selectRecipe();
    }
    @Override
    public void execute() {
        handleModifyRecipe();
        modifyRecipeCategories();
        modifyRecipeDescription();
        modifyRecipeIngredients();
        modifyRecipeInstructions();
        modifyRecipeName();
        modifyRecipeServiceSize();
        modifyRecipeTags();
        selectRecipeToModify();
        undoModification(1, "name");
    }

}
