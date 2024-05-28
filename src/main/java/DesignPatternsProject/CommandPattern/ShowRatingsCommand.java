package DesignPatternsProject.CommandPattern;

public class ShowRatingsCommand implements Command{
    public static void handleRecipeRating() {

        System.out.println("Choose 1 to rank according to the average rating. ");
        System.out.println("Choose 2 to rank according to the total rating. ");

        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice < 1 || choice > 2)
                    System.out.println("Invalid choice, please try again.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        if(choice == 1)
            ListRecipesCommand.listAllRecipesForAverageRatings();
        else
            ListRecipesCommand.listAllRecipesForTotalRatings();
    }
    @Override
    public void execute() {
        handleRecipeRating();
    }
}
