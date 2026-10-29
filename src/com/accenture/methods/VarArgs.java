package com.accenture.methods;

// using "..." in data type for arguments makes it that many values can be passed
public class VarArgs {
    static double totalDeposits(double... deposits){
        double total = 0;

        for (double deposit : deposits){
            total += deposit;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("---- VarARGS DEMO ----");

        double firstTotal = totalDeposits(100.5, 200.75, 50.25);
        System.out.println("\nFirst Deposit Total: PHP " + firstTotal);

        double emptyTotal = totalDeposits();
        System.out.println("\nEmpty Deposit Total: PHP " + emptyTotal);

        double[] thirdDeposits = {500.0, 1000.0, 20000.0};
        double thirdTotal = totalDeposits(thirdDeposits);
        System.out.println("\nThird Deposit Total: PHP " + thirdTotal);
    }
}
