package Realty_Company;

import java.util.Scanner;

public abstract class  Property {
    protected String address;
    protected String city;
    protected String state;
    protected int postalCode;
    protected int numBedrooms;
    protected int numBathrooms;


 
    public static void inputProperty(Property property){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter property address: ");
        property.address = sc.nextLine();
        System.out.println("Enter city: ");
        property.city = sc.nextLine();
        System.out.println("Enter state: ");
        property.state = sc.nextLine();
        System.out.println("Enter postal code: ");
        property.postalCode = sc.nextInt();
        System.out.println("Enter number of bedrooms: ");
        property.numBedrooms = sc.nextInt();
        System.out.println("Enter number of bathrooms: ");
        property.numBathrooms = sc.nextInt();
    }
    public abstract void print();
}