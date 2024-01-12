package ParkingLot.Strategies.SlotAssignmentStrategy;

import ParkingLot.models.Gate;
import ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public RandomSlotAssignmentStrategy getSlot(Gate gate, VehicleType vehicleType);
}
