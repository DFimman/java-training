package com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.view;
import com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.model.Customer;

public class Display {
    public static void showMenu(){
        System.out.print(
                "--List foreign currency" +
                        "\n1 - USD" +
                        "\n2 - EUR" +
                        "\n3 - JPY" +
                        "\n4 - AUD" +
                        "\nSelect foreign currency: "
        );
    }

    public static void showTransaction (Customer kustomer){
        //output
        if (kustomer.isValid) {
            System.out.println("Customer Name: " + kustomer.name);
            System.out.println("Philippine Peso: Php " + kustomer.pesoAmount);
            System.out.println("Foreign Currency Equivalent: " + kustomer.currencyEquivalent + kustomer.convertedAmount);
        } else {
            System.err.println("\nInvalid Selected Foreign Currency Target. Please Try Again!");
        }
    }
}
