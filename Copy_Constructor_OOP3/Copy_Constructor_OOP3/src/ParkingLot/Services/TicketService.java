package ParkingLot.Services;

import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.ParkingLotRepository;
import ParkingLot.Repositories.TicketRepository;
import ParkingLot.Repositories.VehicleRepository;
import ParkingLot.Strategies.SlotAssignmentStrategy.SlotAssignmentStrategy;
import ParkingLot.Strategies.SlotAssignmentStrategy.SlotAssignmentStrategyFactory;
import ParkingLot.models.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(VehicleType vehicleType,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              Long gateId)
            throws Exception {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> gateOptional = gateRepository.getGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        ticket.setGeneratedAt(gateOptional.get());
        ticket.setGeneratedBy(gateOptional.get().getOperator());
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            Vehicle vehicleNew = new Vehicle(vehicleNumber, vehicleType, vehicleOwnerName);
            savedVehicle = vehicleNew;
        }else{
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGate(gateOptional.get());
        SlotAssignmentStaretegyType slotAssignmentStaretegyType = parkingLot.getSlotAssignmentStaretegy();
        SlotAssignmentStrategy slotAssignmentStrategyType = SlotAssignmentStrategyFactory.getSpotForType(slotAssignmentStaretegyType);
        SlotAssignmentStrategy slotAssignmentStrategy = slotAssignmentStrategyType.getSlot(gateOptional.get(), vehicleType);
        Ticket savedTicket = ticketRepository.saveTicket(ticket);
        savedTicket.setNumber("Ticket" + savedTicket.getId());
        return savedTicket;





    }
}
