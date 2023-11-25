package DET;

public class ApartmentBuilding extends Building {
    private int totalUnits;

    public ApartmentBuilding(Address address, int squareFootage, int totalUnits) {
        super(address, squareFootage);
        this.totalUnits = totalUnits;
    }

    public int getTotalUnits() {
        return totalUnits;
    }
}
