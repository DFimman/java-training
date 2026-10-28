package com.accenture.loops;
import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "\n1. Add User" +
                    "\n2. Delete User" +
                    "\n3. Update User" +
                    "\n4. Exit");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
        }while (choice != 4);
        System.out.println("Exit....");
    }
}
