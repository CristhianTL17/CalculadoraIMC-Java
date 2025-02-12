public class Main {
    public static void main(String[] args) {
        double weight, height;
        double bmi = 0;
        String bmiSystem;
        String bmiCategory;

        // Crear objetos de UserInput y BMICalculator
        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        // Obtener sistema de BMI
        bmiSystem = userInput.obtainBMISystem();

        // Obtener peso y altura según el sistema de BMI
        weight = userInput.obtainWeight(bmiSystem);
        height = userInput.obtainHeight(bmiSystem);

        // Calcular el BMI dependiendo del sistema
        if (bmiSystem.equalsIgnoreCase("Imperial")) {
            bmi = bmiCalculator.calculateBmiImperial(weight, height);
        } else if (bmiSystem.equalsIgnoreCase("Metric")) {
            bmi = bmiCalculator.calculateBmiMetric(weight, height);
        }

        // Mostrar el resultado
        System.out.println("Your BMI is: " + bmi);
        bmiCategory = bmiCalculator.getBMICategory(bmi);
        System.out.println("Your BMI category is: " + bmiCategory);
    }
}

