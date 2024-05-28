package DesignPatternsProject.CommandPattern;
import DesignPatternsProject.DefaultClasses.Tag;
import java.util.HashSet;

public class TagCommand implements Command{
    static HashSet<Tag> createTagList(){
        HashSet<Tag> tagList = new HashSet<Tag>(3);


        System.out.println("<-------------------  TAGS  ------------------->");
        System.out.println("Please select up to 3 different tags from the list below: ");
        System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
        System.out.println("|   4. SALTY                5. FRESH                6. COLD     |");
        System.out.println("|   7. HOT                  8. QUICK                9. EASY     |");
        System.out.println("|   10. HEALTHY             11. VEGETARIAN          12. VEGAN   |");
        System.out.println("|   13. GLUTEN_FREE         14. NONE                            |");



        while (tagList.size() < 3) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if(choice == 14) break;
            switch (choice) {
                case 1:
                    tagList.add(Tag.SPICY);
                    break;
                case 2:
                    tagList.add(Tag.SWEET);
                    break;
                case 3:
                    tagList.add(Tag.SOUR);
                    break;
                case 4:
                    tagList.add(Tag.SALTY);
                    break;
                case 5:
                    tagList.add(Tag.FRESH);
                    break;
                case 6:
                    tagList.add(Tag.COLD);
                    break;
                case 7:
                    tagList.add(Tag.HOT);
                    break;
                case 8:
                    tagList.add(Tag.QUICK);
                    break;
                case 9:
                    tagList.add(Tag.EASY);
                    break;
                case 10:
                    tagList.add(Tag.HEALTHY);
                    break;
                case 11:
                    tagList.add(Tag.VEGETARIAN);
                    break;
                case 12:
                    tagList.add(Tag.VEGAN);
                    break;
                case 13:
                    tagList.add(Tag.GLUTEN_FREE);
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        return tagList;
    }

    public static Tag selectTag() {
        System.out.println("<-------------------  TAGS  ------------------->");
        System.out.println("Please select up to 3 different tags from the list below: ");
        System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
        System.out.println("|   4. SALTY                5. FRESH                6. COLD     |");
        System.out.println("|   7. HOT                  8. QUICK                9. EASY     |");
        System.out.println("|   10. HEALTHY             11. VEGETARIAN          12. VEGAN   |");
        System.out.println("|   13. GLUTEN_FREE         14. NONE                            |");


        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice > 0 && choice < 15) break;
                else System.out.println("Invalid choice (1-14)");
            } catch (Exception e) {
                System.out.println("Invalid choice (input a number)");
            }
        }
        switch (choice) {
            case 1:
                return Tag.SPICY;
            case 2:
                return Tag.SWEET;
            case 3:
                return Tag.SOUR;
            case 4:
                return Tag.SALTY;
            case 5:
                return Tag.FRESH;
            case 6:
                return Tag.COLD;
            case 7:
                return Tag.HOT;
            case 8:
                return Tag.QUICK;
            case 9:
                return Tag.EASY;
            case 10:
                return Tag.HEALTHY;
            case 11:
                return Tag.HEALTHY;
            case 12:
                return Tag.VEGETARIAN;
            case 13:
                return Tag.VEGAN;
            case 14:
                return Tag.GLUTEN_FREE;
            default:
                System.out.println("Invalid choice");
                return null;
        }

    }
    @Override
    public void execute() {
        selectTag();
        createTagList();
    }

}
