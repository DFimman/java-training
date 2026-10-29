package com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.controller;

import java.util.Scanner;
import com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.model.Customer;
import com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.view.Display;

public class ForexMVCDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // <className> <ojectName> = new <className>()'
        Customer myCustomer = new Customer(); //object instantiation

        // input variable
        System.out.print("Enter costumer Name: ");
        myCustomer.name = sc.nextLine();

        Display.showMenu();
        myCustomer.currencySelected = sc.nextLine();

        System.out.print("\nEnter Philippine Peso amount: Php");
        myCustomer.pesoAmount = sc.nextDouble();

        myCustomer.convertAmount();

        Display.showTransaction(myCustomer);

        sc.close();
    }


}
