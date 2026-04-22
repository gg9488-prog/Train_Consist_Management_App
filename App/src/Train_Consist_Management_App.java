import java.util.Scanner;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID found: " + key);
        } else {
            System.out.println("Bogie ID not found: " + key);
        }

        scanner.close();
    }
}