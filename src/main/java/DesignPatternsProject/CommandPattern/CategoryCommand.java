package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.DefaultClasses.Category;
import DesignPatternsProject.DefaultClasses.MainPage;

import java.util.HashSet;

public class CategoryCommand implements Command{
    static HashSet<Category> createCategoryList(){
        HashSet<Category> categories = new HashSet<Category>(3);

        System.out.println("-------------------- CATEGORIES -------------------- ");

        System.out.println("<--------- Select Categories (max 3): ---------->");
        System.out.println("|   1. Breakfast            2. Lunch                3. Dinner       |");
        System.out.println("|   4. Dessert              5. Appetizer            6. Snack        |");
        System.out.println("|   7. Drink                8. Salad                9. Soup         |");
        System.out.println("|   10. Sauce               11. Side Dish           12.Pasta        |");
        System.out.println("|   13. Meat                14. Seafood             15.Vegetable    |");
        System.out.println("|                           16.Back to main menu                    |");

        while (categories.size() < 3) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if(choice == 24) break;
            switch (choice) {
                case 1:
                    categories.add(Category.BREAKFAST);
                    break;
                case 2:
                    categories.add(Category.LUNCH);
                    break;
                case 3:
                    categories.add(Category.DINNER);
                    break;
                case 4:
                    categories.add(Category.DESSERT);
                    break;
                case 5:
                    categories.add(Category.APPETIZER);
                    break;
                case 6:
                    categories.add(Category.SNACK);
                    break;
                case 7:
                    categories.add(Category.DRINK);
                    break;
                case 8:
                    categories.add(Category.SALAD);
                    break;
                case 9:
                    categories.add(Category.SOUP);
                    break;
                case 10:
                    categories.add(Category.SAUCE);
                    break;
                case 11:
                    categories.add(Category.SIDE_DISH);
                    break;
                case 12:
                    categories.add(Category.PASTA);
                    break;
                case 13:
                    categories.add(Category.MEAT);
                    break;
                case 14:
                    categories.add(Category.SEAFOOD);
                    break;
                case 15:
                    categories.add(Category.VEGETABLE);
                    break;
                case 16:
                    MainPage.mainPage.showMainPage();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        return categories;
    }

    static Category selectCategory(){
        System.out.println("-------------------- CATEGORIES -------------------- ");

        System.out.println("<--------- Select Categories (max 3): ---------->");
        System.out.println("|   1. Breakfast            2. Lunch                3. Dinner       |");
        System.out.println("|   4. Dessert              5. Appetizer            6. Snack        |");
        System.out.println("|   7. Drink                8. Salad                9. Soup         |");
        System.out.println("|   10. Sauce               11. Side Dish           12.Pasta        |");
        System.out.println("|   13. Meat                14. Seafood             15.Vegetable    |");
        System.out.println("|                           16.Back to main menu                    |");

        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice > 0 && choice < 25) break;
                else System.out.println("Invalid choice");
            } catch (Exception e) {
                System.out.println("Invalid choice");
            }
        }

        Category category = Category.NONE;

        switch (choice){
            case 1:
                category = Category.BREAKFAST;
                break;
            case 2:
                category = Category.LUNCH;
                break;
            case 3:
                category = Category.DINNER;
                break;
            case 4:
                category = Category.DESSERT;
                break;
            case 5:
                category = Category.APPETIZER;
                break;
            case 6:
                category = Category.SNACK;
                break;
            case 7:
                category = Category.DRINK;
                break;
            case 8:
                category = Category.SALAD;
                break;
            case 9:
                category = Category.SOUP;
                break;
            case 10:
                category = Category.SAUCE;
                break;
            case 11:
                category = Category.SIDE_DISH;
                break;
            case 12:
                category = Category.PASTA;
                break;
            case 13:
                category = Category.MEAT;
                break;
            case 14:
                category = Category.SEAFOOD;
                break;
            case 15:
                category = Category.VEGETABLE;
                break;
            case 16:
                category = Category.NONE;
                MainPage.mainPage.showMainPage();
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }

        return category;

    }
    @Override
    public void execute() {
        createCategoryList();
        selectCategory();
    }
}
