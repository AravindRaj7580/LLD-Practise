package ParkingLot.models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private List<VehicleType> supportedVehicletypes;
    private  ParkingSpotStatus pakingSpotStatus;
    private int spotnumber;
    private ParkingFloor parkingFloor;
}
