package com.accenture.methods;

// Pass by reference happen when you use nonprimitive data, reference is being passed rather than the value

public class PassByReference {
    public static void main(String[] args) {
        System.out.println("----- PASSING ARRAY TO METHODS -----");

        double[] accountBalances = {5000.0, 10000.0, 15000.0};

        System.out.println("\nBalances before the service fee: ");
        for (double balances : accountBalances){
            System.out.println("PHP " + balances);
        }

        applyServiceFee(accountBalances);

        System.out.println("\nBalances after the service fee: ");
        for (double balances : accountBalances){
            System.out.println("PHP " + balances);
        }
    }

    static void applyServiceFee(double[] balances){
        System.out.println("\nBalances inside the method:");
        for (int index = 0; index < balances.length; index++){
            balances[index] -= 10;
            System.out.println(balances[index]);
        }

    }
}
