import java.util.Scanner;
import java.util.Arrays;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
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