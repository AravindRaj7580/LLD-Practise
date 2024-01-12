package ParkingLot;

import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.ParkingLotRepository;
import ParkingLot.Repositories.TicketRepository;
import ParkingLot.Repositories.VehicleRepository;
import ParkingLot.Services.TicketService;
import ParkingLot.controllers.TicketController;

public class ParkingLotApplication {
    GateRepository gateRepository = new GateRepository();
    TicketRepository ticketRepository = new TicketRepository();
    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    VehicleRepository vehicleRepository = new VehicleRepository();
    TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);
    TicketController ticketController = new TicketController(ticketService);




}
