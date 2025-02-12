import java.util.Scanner;

public class UserInput {

    private Scanner input;

    // Constructor
    public UserInput() {
        this.input = new Scanner(System.in);
    }

    public String obtainBMISystem() {
        String bmiSystem = "";
        // Prompt until user enters a valid choice
        while (!bmiSystem.equalsIgnoreCase("Imperial") && !bmiSystem.equalsIgnoreCase("Metric")) {
            System.out.println("Welcome to the BMI calculator app!");
            System.out.print("Please select the preferred BMI calculation system (Imperial/Metric): ");
            bmiSystem = input.next();
            if (!(bmiSystem.equalsIgnoreCase("Imperial") || bmiSystem.equalsIgnoreCase("Metric"))) {
                System.out.println("Invalid input. Please enter either 'Imperial' or 'Metric'.");
            }
        }
        return bmiSystem;
    }

    public double obtainWeight(String bmiSystem) {
        double weight = 0;
        boolean isInvalidInput = true;

        while (isInvalidInput) {
            if (bmiSystem.equalsIgnoreCase("Imperial")) {
                System.out.print("Enter weight in Pounds: ");
            } else {
                System.out.print("Enter weight in Kilos: ");
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Invalid input. Please enter a valid weight.");
                input.next(); // Consume the invalid input
            }
        }

        return weight;
    }

    public double obtainHeight(String bmiSystem) {
        double height = 0;
        boolean isInvalidInput = true;

        while (isInvalidInput) {
            if (bmiSystem.equalsIgnoreCase("Imperial")) {
                System.out.print("Enter height in Inches: ");
            } else {
                System.out.print("Enter height in Meters: ");
            }

            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Invalid input. Please enter a valid height.");
                input.next(); // Consume the invalid input
            }
        }

        return height;
    }
}

