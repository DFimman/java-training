package com.accenture.bpi.com.ph.forex.Demo;
import java.util.Scanner;

public class ForexDemoSwtich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter costumer Name: ");
        String name = sc.nextLine();

        System.out.print(
                "--List foreign currency" +
                        "\n1 - USD" +
                        "\n2 - EUR" +
                        "\n3 - JPY" +
                        "\n4 - AUD" +
                        "\nSelect foreign currency: "
        );
        String currencySelected = sc.nextLine();

        System.out.print("\nEnter Philippine Peso amount: Php");
        double pesoAmount = sc.nextDouble();

        //computed variables (local)
        double convertedAmount = 0;
        String currencyEquivalent = "0";
        boolean isValid = true;

        //process
        switch (currencySelected){
            case "1":
                convertedAmount = pesoAmount / 64.35;
                currencyEquivalent = "USD";
                break;
            case "2":
                convertedAmount = pesoAmount / 73.3531;
                currencyEquivalent = "EURO";
                break;
            case "3":
                convertedAmount = pesoAmount / 0.4155;
                currencyEquivalent = "YEN";
                break;
            case "4":
                convertedAmount = pesoAmount / 46.1469;
                currencyEquivalent = "AUD";
                break;
            default:
                isValid = false;
        }

        //output
        if (isValid) {
            System.out.println("Customer Name: " + name);
            System.out.println("Philippine Peso: Php " + pesoAmount);
            System.out.println("Foreign Currency Equivalent: " + currencyEquivalent + convertedAmount);
        } else {
            System.err.println("\nInvalid Selected Foreign Currency Target. Please Try Again!");
        }

        sc.close();


    }
}
