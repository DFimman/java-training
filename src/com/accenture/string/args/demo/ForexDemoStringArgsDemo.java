package com.accenture.string.args.demo;

public class ForexDemoStringArgsDemo {
    public static void main(String[] args) {


       //System.out.print("Enter costumer Name: ");
        String name = args[0];

        /* System.out.print(
                "--List foreign currency" +
                        "\n1 - USD" +
                        "\n2 - EUR" +
                        "\n3 - JPY" +
                        "\n4 - AUD" +
                        "\nSelect foreign currency: "
        );*/
        String currencySelected = args[1];

        //System.out.print("\nEnter Philippine Peso amount: Php");
        double pesoAmount = Double.parseDouble(args[2]); //String to double data type conversion (parses string into double data type)

        //computed variables (local)
        double convertedAmount = 0;
        String currencyEquivalent = "0";
        boolean isValid = true;

        if (currencySelected.equals("1")) {
            convertedAmount = pesoAmount / 64.35;
            currencyEquivalent = "USD";
        } else if (currencySelected.equals("2")) {
            convertedAmount = pesoAmount / 73.3531;
            currencyEquivalent = "EURO";
        } else if (currencySelected.equals("3")) {
            convertedAmount = pesoAmount / 0.4155;
            currencyEquivalent = "YEN";
        } else if (currencySelected.equals("4")) {
            convertedAmount = pesoAmount / 46.1469;
            currencyEquivalent = "AUD";
        } else {
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
    }
}
