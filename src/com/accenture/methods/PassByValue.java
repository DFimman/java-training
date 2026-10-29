package com.accenture.methods;

// when datatypes being used are primitive data types, they pass by values. mean it copy their value instead being referenced by
public class PassByValue {
    public static void main(String[] args) {
        System.out.println("----- PASS BY VALUE -----");

        double accountBalance = 5000.0;

        System.out.println("\nBalance before the service fee: ");
        System.out.println("PHP: " + accountBalance);

        applyServiceFee(accountBalance);

        System.out.println("\nBalance after the service fee method:");
        System.out.println("PHP: " + accountBalance);



    }

    static void applyServiceFee(double balance){
        System.out.println("\nInside applyServiceFee: ");
        balance -= 10;

        System.out.println("Balance inside method: PHP " + balance);
    }
}
