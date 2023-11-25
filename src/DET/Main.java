package DET;

public class Main {
    public static void main(String[] args) {
        Address buildingAddress = new Address("123 Main St", "Cityville", "State", "12345");
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding(buildingAddress, 5000, 20);

        System.out.println("Building Address: " + apartmentBuilding.getAddress().toString());
        System.out.println("Square Footage: " + apartmentBuilding.getSquareFootage() + " sq.ft");
        System.out.println("Total Units: " + apartmentBuilding.getTotalUnits());
    }
}
