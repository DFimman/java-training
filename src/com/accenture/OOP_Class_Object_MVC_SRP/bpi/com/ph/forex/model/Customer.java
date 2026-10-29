package com.accenture.OOP_Class_Object_MVC_SRP.bpi.com.ph.forex.model;

public class Customer {
    // input instances variables (owned by the object)
    public String name;
    public String currencySelected;
    public double pesoAmount;

    // computed instance variables
    public double convertedAmount;
    public String currencyEquivalent;
    public boolean isValid;

    public void convertAmount() {
        isValid = true;

        //process
        switch(currencySelected) {
            case "1":
                convertedAmount = pesoAmount / 64.35;
                currencyEquivalent = "USD$";
                break;
            case "2":
                convertedAmount = pesoAmount / 73.3531;
                currencyEquivalent = "€";
                break;

            case "3":
                convertedAmount = pesoAmount / 0.4166;
                currencyEquivalent = "¥";
                break;
            case "4":
                convertedAmount = pesoAmount / 46.1469;
                currencyEquivalent = "AUD$";
                break;
            default:
                isValid = false;
                break;
        }
    }
}

