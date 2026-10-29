package com.accenture.code.exercises.day1;
import java.util.Scanner;

/***************
 * Day of the Week Code Exercise - My approach
 *
 * @author immanuel.f.dichosa
 * @since 10/29/2026
 * @version 1.0
 ***************/

public class DayOfTheWeek {

    // accept numbers 1 to 7 (Add validation)
    // use switch to print day of the week
    // additionally print whether weekday or weekend

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------DAY OF THE WEEK-------");

        // input
        System.out.print("Enter number [1 - 7]: ");
        String select = sc.nextLine();
        String day = "";
        boolean isWeekday = true;


        // process
        switch (select){
            case "1":
                day = "Monday";
                break;
            case "2":
                day = "Tuesday";
                break;
            case "3":
                day = "Wednesday";
                break;
            case "4":
                day = "Thursday";
                break;
            case "5":
                day = "Friday";
                break;
            case "6":
                day = "Saturday";
                isWeekday = false;
                break;
            case "7":
                day = "Sunday";
                isWeekday = false;
                break;
            default:
                System.err.println("INVALID INPUT!");
                return;
        }

        sc.close(); //close scanner

        // display
        System.out.println("\nDay: " + day);
        System.out.println("Type: " + (isWeekday ? "Weekday" : "Weekend"));
    }
}
