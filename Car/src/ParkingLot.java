public class ParkingLot {

    private String parkingLotName;
    private String parkingLotAddress;
    private Car[] parkingsCars = new Car[20];

    public ParkingLot(String newParkingLotName, String newParkingLotAddress, Car[] newCars)
    {
        this.parkingLotName = newParkingLotName;
        this.parkingLotAddress = newParkingLotAddress;
        this.parkingsCars = newCars;
    }

}

