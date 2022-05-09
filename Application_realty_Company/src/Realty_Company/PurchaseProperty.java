package Realty_Company;

import java.util.Scanner;

abstract class PurchaseProperty extends Property{
    protected double price;
    protected double tax;

    static void inputPurchaseProperty(PurchaseProperty property){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price for the purchased property: ");
        property.price = sc.nextDouble();
        System.out.println("Enter the tax: ");
        property.tax = sc.nextDouble();

    }
}
