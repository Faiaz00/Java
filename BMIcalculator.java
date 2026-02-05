import java.util.Scanner;

public class BMIcalculator {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scnr.nextInt();

        if (age >= 20) {
            System.out.print("Enter weight in pounds: ");
            double weightInPounds = scnr.nextDouble();

            System.out.print("Enter height in inches: ");
            double heightInInches = scnr.nextDouble();

            double weightInKG = weightInPounds * 0.45359237;

            double heightInM = heightInInches * 0.0254;

            double bmi = weightInKG / (heightInM * heightInM);

            if (bmi < 18.5) {
              System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 25.0) {
              System.out.println("Normal");
            } else if (bmi >= 25.0 && bmi < 30.0) {
              System.out.println("Overweight");
            } else {
              System.out.println("Obese");
            }
        } else {
            System.out.println("BMI calculation is only for individuals 20 years or older.");
        }
    }
}
