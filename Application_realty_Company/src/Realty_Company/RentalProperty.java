package Realty_Company;

import java.util.Scanner;

public abstract class RentalProperty extends Property{
    protected double rent;
    protected int leasePeriod;

    static void inputRentalProperty(RentalProperty property){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter the rent: ");
        property.rent = sc.nextDouble();
        System.out.println("please Enter you lease Period: ");
        property.leasePeriod = sc.nextInt();

    }
}
