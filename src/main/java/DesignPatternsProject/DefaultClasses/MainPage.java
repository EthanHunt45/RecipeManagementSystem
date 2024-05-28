package DesignPatternsProject.DefaultClasses;
import DesignPatternsProject.CommandPattern.*;

public class MainPage {
    public static MainPage mainPage = new MainPage();
    public static void showMainPage() {

        boolean quit = false;

        while (!quit) {
            System.out.println("=========== Main Menu ===========");
            System.out.println("|   1. Create Recipe             |");
            System.out.println("|   2. Search Recipe             |");
            System.out.println("|   3. Modify Recipe             |");
            System.out.println("|   4. Rate Recipe               |");
            System.out.println("|   5. List All Recipes          |");
            System.out.println("|   6. Show Ratings              |");
            System.out.println("|   7. Quit                      |");
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            //int choice = scanner.nextInt();
            int choice = 0;
            try {
                choice = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }

            switch (choice) {
                case 1:
                    System.out.println("Create Recipe selected");
                    CreateRecipeCommand.handleCreateRecipe();
                    break;
                case 2:
                    System.out.println("Search Recipe selected");
                    SearchRecipeCommand.handleSearchRecipe();
                    break;
                case 3:
                    System.out.println("Modify Recipe selected");
                    ModificationCommand handleModifyRecipe = new ModificationCommand();
                    handleModifyRecipe.handleModifyRecipe();
                    break;
                case 4:
                    System.out.println("Rate Recipe selected");
                    RateRecipeCommand.handleRateRecipe();
                    break;
                case 5:
                    ListRecipesCommand.listAllRecipes();
                    break;
                case 6:
                    System.out.println("Show Ratings selected");
                    RateRecipeCommand.handleRateRecipe();
                    break;
                case 7:
                    System.out.println("Quitting the program...");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            System.out.println();
        }
    }
}
