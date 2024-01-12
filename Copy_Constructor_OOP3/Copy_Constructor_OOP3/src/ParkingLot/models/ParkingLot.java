package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
   private List<ParkingFloor> parkingFloor;
   private List<Gate> gates;

   public List<ParkingFloor> getParkingFloor() {
      return parkingFloor;
   }

   public void setParkingFloor(List<ParkingFloor> parkingFloor) {
      this.parkingFloor = parkingFloor;
   }

   public List<Gate> getGates() {
      return gates;
   }

   public void setGates(List<Gate> gates) {
      this.gates = gates;
   }

   public List<VehicleType> getVehicleTypes() {
      return vehicleTypes;
   }

   public void setVehicleTypes(List<VehicleType> vehicleTypes) {
      this.vehicleTypes = vehicleTypes;
   }

   public ParkingLotStatus getParkingLotStatus() {
      return parkingLotStatus;
   }

   public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
      this.parkingLotStatus = parkingLotStatus;
   }

   public SlotAssignmentStaretegyType getSlotAssignmentStaretegy() {
      return slotAssignmentStaretegy;
   }

   public void setSlotAssignmentStaretegy(SlotAssignmentStaretegyType slotAssignmentStaretegy) {
      this.slotAssignmentStaretegy = slotAssignmentStaretegy;
   }

   public FeeCalculatorStrategyType getFeeCalculatorStrategyType() {
      return feeCalculatorStrategyType;
   }

   public void setFeeCalculatorStrategyType(FeeCalculatorStrategyType feeCalculatorStrategyType) {
      this.feeCalculatorStrategyType = feeCalculatorStrategyType;
   }

   private List<VehicleType> vehicleTypes;
   private ParkingLotStatus parkingLotStatus;
   private SlotAssignmentStaretegyType slotAssignmentStaretegy;
   private FeeCalculatorStrategyType feeCalculatorStrategyType;
}
