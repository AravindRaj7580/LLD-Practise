package ParkingLot.Strategies.SlotAssignmentStrategy;

import ParkingLot.models.SlotAssignmentStaretegyType;

public class SlotAssignmentStrategyFactory {

    public static SlotAssignmentStrategy getSpotForType(SlotAssignmentStaretegyType slotAssignmentStaretegyType) {

        return new RandomSlotAssignmentStrategy();



    }


}
