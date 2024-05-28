package DesignPatternsProject.DefaultClasses;
import DesignPatternsProject.AbstractFactoryPattern.Recipe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


    public class ModifyRecipe {

        Recipe recipe;

        public ModifyRecipe(Recipe recipe) {
            this.recipe = recipe;
        }

        public void modifyRecipeName(String name) {
            recipe.setName(name);
        }

        public void modifyRecipeDescription(String description) {
            recipe.setDescription(description);
        }

        public void modifyRecipeSize(int size) {
            recipe.setSize(size);
        }

        public void modifyRecipeCategories(HashSet<Category> categories) {
            recipe.setCategories(categories);
        }

        public void modifyRecipeTags(HashSet<Tag> tags) {
            recipe.setTags(tags);

        }

        public void modifyRecipeIngredients(List<Ingredient> ingredient) {
            recipe.setIngredients(ingredient);
        }

        public void modifyRecipeInstructions(ArrayList<String> instructions) {
            recipe.setInstructions(instructions);
        }
}
