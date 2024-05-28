package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.DefaultClasses.Ingredient;
import DesignPatternsProject.DefaultClasses.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngredientCommand implements Command{
    static List<Ingredient> createIngredientList() {
        List<Ingredient> ingredients = new ArrayList<>();
        System.out.println("<---------------------- Add Ingredients ---------------------->");
        System.out.println("Creating Ingredients.. ");

        while (true) {
            System.out.println("Please input the name of the ingredient: (Please type \"done\" when you finish creating ingredient) ");
            String name = System.console().readLine();
            if (name.equals("done")) {
                break;
            }
            Ingredient ingredient = createIngredient(name);

            if (ingredient != null) {
                ingredients.add(ingredient);
            }


        }
        return ingredients;
    }

    private static Ingredient createIngredient(String name){
        System.out.println("Please input the amount of the ingredient: ");
        double amount;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                amount = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return null;
            }
        }


        Unit unit = null;
        System.out.println("Please input the unit of the ingredient: ");
        System.out.println("|   1. BOTTLE               2. CAN                  3. CUP      |");
        System.out.println("|   4. TABLESPOON           5. TEASPOON             6. KILOGRAM |");
        System.out.println("|   7. LITER                8. PIECE                            |");
        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again (choose 1-8).");
                return null;
            }
        }


        return new Ingredient(name, amount, unit);
    }
    @Override
    public void execute() {
        createIngredientList();
        createIngredient("name");
    }
}
