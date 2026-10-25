import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PlannerStrategy> strategies = new LinkedHashMap<>();
        strategies.put("1", new MinimalistStrategy());
        strategies.put("2", new CozyStrategy());
        strategies.put("3", new StudycoreStrategy());

        System.out.println(" ");
        System.out.println("   AESTHETIC PLANNER");
        System.out.println(" ");

        System.out.print("Enter your main goal: ");
        String goal = scanner.nextLine();

        Planner planner = new Planner(strategies.get("1"));
        boolean running = true;

        while (running) {
            System.out.println("\nChoose your planning style:");
            System.out.println("1. Minimalist");
            System.out.println("2. Cozy");
            System.out.println("3. Studycore");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                running = false;
                System.out.println("Thank you for using Aesthetic Planner!");
                continue;
            }

            PlannerStrategy selectedStrategy = strategies.get(choice);

            if (selectedStrategy == null) {
                System.out.println("Invalid choice. Please select 1, 2, 3 or 0.");
                continue;
            }

            planner.setStrategy(selectedStrategy);
            System.out.println("\n" + planner.generatePlan(goal));
        }

        scanner.close();
    }
}
