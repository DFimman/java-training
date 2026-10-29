package com.accenture.code.exercises.day1;
import java.util.Scanner;

/***************
 * BMI Calculator Code Exercise - My approach
 *
 * @author immanuel.f.dichosa
 * @since 10/29/2026
 * @version 1.0
 ***************/

public class ElectricityBillCalculator {

    // Accept a number of kilowatt-hours (kWh) consumed
    // Compute electricity bill based on given
        //  < 100 -> 5.00
        // 101 - 200 -> 8.00
        // 201 - 300 -> 10.00
        // 300 > -> 12.0
        // hint dynamic consumption
    // add fixed monthly charge of PHP 50.00 on total
    // print total bill
    public static void main(String[] args) {
        System.out.println("-------ELECTRICITY BILL CALCULATOR-------");

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount of watts consumed [kWh]: ");
        double kwhConsumed = sc.nextDouble();
        double bill = 0;

        // process
        // computer for each consumption per rate
        if (kwhConsumed >= 0 && kwhConsumed <= 100){
            bill = kwhConsumed * 5;
        } else if (kwhConsumed > 100 && kwhConsumed <= 200) {
            bill += 500; // first tier
            bill += (kwhConsumed - 100) * 8;
        } else if (kwhConsumed > 200 && kwhConsumed <= 300) {
            bill += 500; // first tier
            bill += 800; // second tier
            bill += (kwhConsumed - 200) * 10;
        } else if (kwhConsumed > 300) {
            bill += 500; // first tier
            bill += 800; // second tier
            bill += 1000; // third tier
            bill += (kwhConsumed - 300) * 12;
        } else {
            System.out.println("INVALID");
        }
        double totalBill = bill + 50; // add 50 monthly charge

        // display
        System.out.printf("Total Electric bill: %.2f", totalBill);
    }
}
