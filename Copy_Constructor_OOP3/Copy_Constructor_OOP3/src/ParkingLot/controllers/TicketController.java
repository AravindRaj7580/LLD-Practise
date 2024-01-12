package ParkingLot.controllers;

import ParkingLot.DTOs.IssueResponseStatus;
import ParkingLot.DTOs.IssueTicketDTORequest;
import ParkingLot.DTOs.IssueTicketDTOResponse;
import ParkingLot.Services.TicketService;
import ParkingLot.models.Ticket;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    IssueTicketDTOResponse issueTicket(IssueTicketDTORequest request){
        IssueTicketDTOResponse issueTicketDTOResponse = new IssueTicketDTOResponse();
        Ticket ticket;
        try{
            ticket = ticketService.issueTicket(request.getVehicleType(),
                    request.getVehicleNumber(),
                    request.getVehicleOwnerName(),
                    request.getGateId());

        }catch (Exception ex){
            issueTicketDTOResponse.setResponseStatus(IssueResponseStatus.FAILURE);
            return issueTicketDTOResponse;
        }
        issueTicketDTOResponse.setTicket(ticket);
        issueTicketDTOResponse.setResponseStatus(IssueResponseStatus.SUCCESS);
        return issueTicketDTOResponse;

    }
}
