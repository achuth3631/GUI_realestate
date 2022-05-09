package Realty_Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();
        System.out.println("Realty Company.");
        System.out.println("The below is for Real Estate Management application for house listings:");
        while (true) {
            System.out.println("Choose any one of the following choices which you want to select---A/B/C/D/E : ");
            System.out.println("A). Create house listing");
            System.out.println("B). Create condominium listing");
            System.out.println("C). Create apartment listing");
            System.out.println("D). Show listings");
            System.out.println("E). Exit");
            System.out.println("Enter your choice : >");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            System.out.println(choice);
            switch (choice) {
                case "A":
                    var house = new House();
                    Property.inputProperty(house);
                    PurchaseProperty.inputPurchaseProperty(house);
                    properties.add(house);
                    break;
                case "B":
                    var condominium = new Condominium();
                    Property.inputProperty(condominium);
                    PurchaseProperty.inputPurchaseProperty(condominium);
                    Condominium.inputCondominium(condominium);
                    properties.add(condominium);
                    break;
                case "C":
                    var apartment = new Apartment();
                    Property.inputProperty(apartment);
                    RentalProperty.inputRentalProperty(apartment);
                    properties.add(apartment);
                    break;
                case "D":
                    for(Property property: properties){
                        property.print();
                    }
                    break;
                case "E":
                    System.out.println("Quitting the application ");
                    return;
                default:
                    System.out.println("Incorrect choice, please choose or select the the correct choice which is displayed on the screen.");
            }
        }
    }
}
