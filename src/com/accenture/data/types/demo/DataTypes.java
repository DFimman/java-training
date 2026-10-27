package com.accenture.data.types.demo;

/***************
 * This application demonstrates the 8 primitive types.
 *
 * @author immanuel.f.dichosa
 * @since 10/27/2026
 * @version 1.0
 ***************/
public class DataTypes {
    /*
    The main() method is the entry-point of execution.

    Return: void -> no expecting return value
    Parameter: String[] args
     */
    public static void main(String[] args) {
        // Types of variable declarations
        // 1. local/automatic variable (owned by the function) -> the main here
        // 2. instance variable (owned by the object)
        // 3. class/static variable (owned by the class)


        // ---INTEGRAL DATA TYPES---
        System.out.println("\n---INTEGRAL DATA TYPES---");

        byte number1 = 50; // declaration + initialization
        short number2 = 100; // -> won't be zero, only in object and class
        int number3 = 300_000 + number1 + number2; // implicit or widening or upcasting
        long number4 = 1_000_000000000L;
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
        System.out.println("number4: " + number4);

        // types of data type casting
        //  1. implicit -> program itself / automatic
        //  2. explicit -> user intentional

        // --FLOATING POINT LITERALS
        System.out.println("\n---FLOATING POINT LITERAL---");
        float numberFive = (float) 5.67; // explicit / narrowing / downcasting
        double numberSix = 10242.125151;
        System.out.println("numberFive: " + numberFive);
        System.out.println("numberSix: " + numberSix);

        // known all characters are in unicode -> first 255 based in ASCII

        // character-literal
        System.out.println("\n--Character Literal--");
        char myFaveChar = 'K';
        System.out.println("My Favorite Char: " + myFaveChar);

        /*System.out.println("\nDEC\tSymbol");
        for (int i = 0; i <= 256; i++){
            System.out.println("ASCII: " + i + "\t\tDecimal: " + ((char) i));
        }*/

        // boolean literal
        System.out.println("\n--Boolean Literal--");
        boolean isHalloween = true;
        boolean isChristmas = false;

        System.out.println("Is it Halloween? " + isHalloween);
        System.out.println("Is it Christmas? " + isChristmas);

        // ternary operator
        String message = isHalloween ? "Yes, it's Ha lloween" : "No, it's not Halloween";
        System.out.println("Is it Halloween already?v" + message);

        // sample if-else condition
        if (!isChristmas){
            System.out.println("Not yet, it's still october");
        }else{
            System.out.println("MERRYYY CHRISTMAS!");
        }

        // use of introspection
        if (args instanceof String[]){
            System.out.println("\nargs is of type [String]");
        }else{
            System.out.println(" ");
        }

        if (args instanceof Object){
            System.out.println("\nargs is of type Object.");
        }else{
            System.out.println(" ");
        }

        // logical conditions/operators
        System.out.println("\n--CONDITIONALS--");
        boolean condition1 = true;
        boolean condition2 = false;
        boolean condition3 = true;

        // use of & -> nonlazy
        if (condition2 & condition1 & condition3){
            System.out.println("AND T1: " + (condition2 & condition1 & condition3));
        }else{
            System.out.println("AND F1: " + (condition2 & condition1 & condition3));
        }
        // use of && -> lazy
        if (condition2 && condition1 && condition3){
            System.out.println("AND T2: " + (condition2 & condition1 & condition3));
        }else{
            System.out.println("AND F2: " + (condition2 & condition1 & condition3));
        }
        // use of | -> nonlazy
        if (condition2 | condition1 | condition3){
            System.out.println("OR T1: " + (condition2 | condition1 | condition3));
        }else{
            System.out.println("OR F1: " + (condition2 | condition1 | condition3));
        }
        // use of || -> lazy
        if (condition2 || condition1 || condition3){
            System.out.println("OR T2: " + (condition2 | condition1 | condition3));
        }else{
            System.out.println("OR F2: " + (condition2 | condition1 | condition3));
        }

        // SHORT HAND NOTATION
        System.out.println("\n---SHORT HAND NOTATION---");
        int numberValue = 5;
        numberValue += 10; // numberValue = numberValue + 10
        System.out.println("numberValue += 10: " + numberValue);

    }
}
