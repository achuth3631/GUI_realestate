package Realty_Company;

public class House extends PurchaseProperty {

    // specific print function for the House property-------override method
    @Override
    public void print() {
        System.out.println("House information: \n");
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Postal code: " + this.postalCode);
        System.out.println("Bedrooms: " + this.numBedrooms);
        System.out.println("Bathrooms: " + this.numBathrooms);
        System.out.println("Rent: " + this.price);
        System.out.println("Tax: " + this.tax);
        System.out.println("\n\n");

    }
}