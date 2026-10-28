package com.accenture.arrays.demo;

public class ArraysDemo {
    public static void main(String[] args) {

        //array declaration and initialization
        double[] accountBalances = {
                10000.0,
                29999.0,
                30000.0,
                12450.0,
                52121.0
        };

        //display specific element
        System.out.println("\nThis is element 3: " + accountBalances[2]);
        System.out.println("This is the last element: " + accountBalances[accountBalances.length - 1]);

        //display number of elements
        System.out.println("\nNumber of elements: " + accountBalances.length);

        //change value of an element
        System.out.println("\nOld First Element Value: " + accountBalances[0]);
        accountBalances[0] = 99999.0d;
        System.out.println("New First Element value: " + accountBalances[0]);

        //processing using for loop
        System.out.println();
        for (int i = 0; i < accountBalances.length; i++ ){
            System.out.println("Element " + (i+1) + " : " + accountBalances[i]);
        }

        //processing using enhanced for loop
        System.out.println();
        double sum = 0;
        int counter = 1;
        for (double balance : accountBalances){
            System.out.println("Account " + counter + " Balance: " + balance);
            counter++;
            sum += balance;
        }
        System.out.printf("Total Balance: %.2f", sum);
    }
}
