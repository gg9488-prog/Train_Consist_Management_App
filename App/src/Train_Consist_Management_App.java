import java.util.LinkedHashSet;
import java.util.Set;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> consist = new LinkedHashSet<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("Cargo");
        consist.add("Guard");

        consist.add("Sleeper");

        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(consist);
    }
}