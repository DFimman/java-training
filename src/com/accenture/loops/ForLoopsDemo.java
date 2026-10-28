package com.accenture.loops;

public class ForLoopsDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println();

        String[] names = {"Immanuel", "Kate", "Tawat"};
        for (String name : names){
            System.out.println(name);
        }

        System.out.println();
        //enhanced for loop -> for each
        String[] fruits = {"Banana", "Orange", "Mango"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
