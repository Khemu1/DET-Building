package DET;

public class Building {
    private Address address;
    private int squareFootage;

    public Building(Address address, int squareFootage) {
        this.address = address;
        this.squareFootage = squareFootage;
    }

    public Address getAddress() {
        return address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }
}