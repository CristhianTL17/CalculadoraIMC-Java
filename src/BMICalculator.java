// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    //Atributos
    private double weightPounds; //Peso en libras
    private double heightInches; // Altura en pulgadas
    private double weightKilos; //Peso en kilogramos
    private double heightMeters; //Altura en metros


    // Use this default no arguments constructor to initialize the 4 properties to some initial values
    //Constructor sin argumentos
    public BMICalculator() {
        this.weightPounds = 0.0; //Valor inicial
        this.heightInches = 0.0; //Valor inicial
        this.weightKilos = 0.0; //Valor inicial
        this.heightMeters = 0.0; //Valor inicial

    }

    // Implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (703 * weightInPounds) / (heightInInches * heightInInches);

    }

    // Implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        // Set the attributes
        this.weightKilos = weightInKilos;
        this.heightMeters = heightInMeters;

        // Calculate and return the BMI using the metric system formula
        return weightInKilos / (heightInMeters * heightInMeters);


    }

    // Implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {

        if (bmi < 18.5){
            return "Underweight";

        } else if(bmi < 25){
            return "Normal weight";

        } else if (bmi<30){
            return "Overweight";
        } else {
            return "Obese";
        }


    }
}
