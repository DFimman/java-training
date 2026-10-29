package com.accenture.code.exercises.day1;
import java.util.Objects;
import java.util.Scanner;

/***********************
 * Job Application Screening Code Exercise - My solution
 *
 * @author Immanuel
 * @since 10/30/26
 * @version 1.0
 *******************/

public class JobApplicationScreening {

    // screens job applicant based on requirements
        //must be least 21 yrs old
        //must have least 2 years of exp
        //must have a college degree (boolean value)
        //must not have more than PHP 30.000 expected salary

    // result must be APPROVED - Scheduled for Interview
    // or REJECTED -> say what is missing condition

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------JOB APPLICATION SCREENING ------");

        // input
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Experience [in yrs]: ");
        int experienceYear = sc.nextInt();

        System.out.print("With College degree? [Y/N]: ");
        String degree = sc.next();


        System.out.print("Enter Expected salary: PHP ");
        double expectedSalary = sc.nextDouble();

        // process
        boolean isAgePass = age >= 21;
        boolean isExpPass = experienceYear >= 2;
        boolean hasDegree = degree.equalsIgnoreCase("y");
        boolean isExpectedPass = expectedSalary <= 30000;
        String result = "Approved";
        String rejectionReason = "";

        // validation
        if (!(isAgePass && isExpPass && hasDegree && isExpectedPass)) {
            result = "Rejected";
        }

        // check rejection Reason
        if (!isAgePass) {
            rejectionReason += "- Age requirement not met\n";
        }
        if (!isExpPass) {
            rejectionReason += "- Insufficient experience\n";
        }
        if (!hasDegree) {
            rejectionReason += "- College degree is required\n";
        }
        if (!isExpectedPass) {
            rejectionReason += "- Expected salary is not in scope\n";
        }

        // display
        if (result.equals("Approved")){
            System.out.println("\nApplication Approved - Schedule for Interview");
        } else if (result.equals("Rejected")) {
            System.out.println("\nApplication Rejected:");
            System.out.println(rejectionReason);
        }


    }
}
