package com.accenture.code.exercises.day1;
import java.util.Scanner;

/***************
 * BMI Calculator Code Exercise - My approach
 *
 * @author immanuel.f.dichosa
 * @since 10/29/2026
 * @version 1.0
 ***************/

public class BMICalculator {

    // accept a person's weigth in kg and height in meters
    // compute for BMI using: BMI = weight / h^2
    // print BMI value

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------- BMI CALCULATOR ------");

        // input
        System.out.print("Enter weight [KG]: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height [meters]: ");
        double height = sc.nextDouble();

        // process
        double BMI = weight / (height * height);
        String BMICategory = "";

        if (BMI >= 0 && BMI < 18.5) {
            BMICategory = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            BMICategory = "Normal";
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            BMICategory = "Overweight";
        } else if (BMI >= 30.0 ) {
            BMICategory = "Obese";
        } else {
            BMICategory = "ERROR!";
        }

        // display
        System.out.printf("\nBMI: %.2f",  BMI);
        System.out.println("\nCategory: " + BMICategory);


    }
}
