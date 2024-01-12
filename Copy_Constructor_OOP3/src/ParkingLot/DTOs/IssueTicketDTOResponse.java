package ParkingLot.DTOs;

import ParkingLot.models.Ticket;

public class IssueTicketDTOResponse {
    private Ticket ticket;
    private IssueResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public IssueResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(IssueResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
