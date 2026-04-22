import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        try {
            searchBogie(bogieIds, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    public static void searchBogie(List<String> bogieIds, String key) {

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie found: " + key);
        } else {
            System.out.println("Bogie not found: " + key);
        }
    }
}