package ParkingLot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    public void setNumber(String number) {
        this.number = number;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setAssignedSlot(ParkingSlot assignedSlot) {
        this.assignedSlot = assignedSlot;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    private String number;
    private Date entryTime;
    private Vehicle vehicle;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int Id;



    private ParkingSlot assignedSlot;
    private Gate generatedAt;
    private Operator generatedBy;

    public String getNumber() {
        return number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getAssignedSlot() {
        return assignedSlot;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }
}
