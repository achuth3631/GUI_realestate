package Realty_Company;

import java.util.Scanner;

public class Condominium extends PurchaseProperty {
    protected double managementFee;

    static void inputCondominium(Condominium condominium){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the management fees: ");
        condominium.managementFee = sc.nextDouble();
    }

    @Override
    public void print() {
        System.out.println("Condominium: \n");
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Postal code: " + this.postalCode);
        System.out.println("Bedrooms: " + this.numBedrooms);
        System.out.println("Bathrooms: " + this.numBathrooms);
        System.out.println("Rent: " + this.price);
        System.out.println("Tax: " + this.tax);
        System.out.println("Management Fees: " + this.managementFee);
        System.out.println("\n\n");

    }
}
