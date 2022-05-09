package Realty_Company;

public class Apartment extends RentalProperty{

    @Override
    public void print() {
        System.out.println("Apartment information: \n");
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Postal code: " + this.postalCode);
        System.out.println("Bedrooms: " + this.numBedrooms);
        System.out.println("Bathrooms: " + this.numBathrooms);
        System.out.println("Rent: " + this.rent);
        System.out.println("Lease Period: " + this.leasePeriod);
        System.out.println("\n\n");
    }
}