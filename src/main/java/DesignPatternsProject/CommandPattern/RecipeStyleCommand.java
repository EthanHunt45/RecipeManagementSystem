package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.DefaultClasses.MainPage;
import DesignPatternsProject.FactoryMethodPattern.*;

import java.util.Scanner;

public class RecipeStyleCommand implements Command{
    static Scanner scanner = new Scanner(System.in);
    static RecipeCreator getRecipeStyle() {
        RecipeCreator recipeFactory;
        System.out.println("--------------- Styles Menu ---------------");
        System.out.println("What Style of Recipe do you want to create?");
        System.out.println("<---    1. Asian Style Recipe          --->");
        System.out.println("<---    2. Turkish Style Recipe        --->");
        System.out.println("<---    3. Korean Style Recipe         --->");
        System.out.println("<---    4. Special Style Recipe        --->");
        System.out.println("<---    5. Back                        --->");
        System.out.println("-------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = 0;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        switch (choice){
            case 1:
                System.out.println("Creating Asian Style Recipe.............");
                recipeFactory = new AsianRecipeFactory();
                return recipeFactory;
            case 2:
                System.out.println("Creating Turkish Style Recipe.............");
                recipeFactory = new TurkishRecipeFactory();
                return recipeFactory;
            case 3:
                System.out.println("Creating Korean Style Recipe.............");
                recipeFactory = new KoreanRecipeFactory();
                return recipeFactory;
            case 4:
                System.out.println("Creating Special Recipe.............");
                System.out.println("Please input the style of the recipe: ");
                String style = scanner.nextLine();
                recipeFactory = new SpecialRecipeFactory(style);
                return recipeFactory;

            case 5:
                MainPage.mainPage.showMainPage();
                return null;

            default:

                System.out.println("Invalid choice, please try again......");
                getRecipeStyle();
                return null;
        }
    }
    @Override
    public void execute() {
        getRecipeStyle();
    }
}
