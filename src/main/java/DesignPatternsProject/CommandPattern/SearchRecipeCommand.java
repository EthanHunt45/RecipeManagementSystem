package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.DefaultClasses.Category;
import DesignPatternsProject.DefaultClasses.MainPage;
import DesignPatternsProject.DefaultClasses.Tag;

public class SearchRecipeCommand implements Command {
    static SearchRecipeCommand search = new SearchRecipeCommand();
    public static void handleSearchRecipe() {
        System.out.println("<---------- Search Recipe ---------->");
        System.out.println("<------   1. Search Recipe By Name                   ------>");
        System.out.println("<------    2. Search Recipe By Category              ------>");
        System.out.println("<------    3. Search Recipe By Ingredient            ------>");
        System.out.println("<------    4. Search Recipe By Tag                   ------>");
        System.out.println("<------    5. Back to Main Menu                  ------>");
        System.out.println("------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return;
            }
        }

        switch (choice) {
            case 1:
                searchRecipeByName();
                break;
            case 2:
                searchRecipeByCategory();
                break;
            case 3:
                searchRecipeByIngredient();
                break;
            case 4:
                searchRecipeByTag();
                break;
            case 5:
                MainPage.mainPage.showMainPage();
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }
    }

    private static void searchRecipeByTag() {
        System.out.println("<---------- Search Recipe By Tag ---------->");
        Tag tag = TagCommand.selectTag();


        search.searchRecipeByTag();
        System.out.println("<-------------------->");

    }

    private static void searchRecipeByIngredient() {
        System.out.println("<---------- Search Recipe By Ingredient ---------->");
        System.out.println("Enter ingredient name: ");
        String name = System.console().readLine();
        search.searchRecipeByIngredient();
        System.out.println("------------------------------------------");
    }

    private static void searchRecipeByCategory() {
        System.out.println("<---------- Search Recipe By Category ---------->");
        Category category = CategoryCommand.selectCategory();
        search.searchRecipeByCategory();
        System.out.println("------------------------------------------");
    }

    public static void searchRecipeByName() {
        System.out.println("<---------- Search Recipe By Name ---------->");
        System.out.print("Enter recipe name: ");
        String name = System.console().readLine();
        search.searchRecipeByName();
        System.out.println("------------------------------------------");

    }
    @Override
    public void execute() {
        handleSearchRecipe();
        searchRecipeByCategory();
        searchRecipeByIngredient();
        searchRecipeByTag();
        searchRecipeByName();

    }
}
