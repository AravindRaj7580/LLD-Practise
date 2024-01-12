package ParkingLot.models;

public class Vehicle {
    String number;
    private VehicleType vehicleType;
    private String owner;

    public Vehicle(String number, VehicleType vehicleType, String owner){
        this.number = number;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getOwner() {
        return owner;
    }
}
