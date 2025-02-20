package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired 
    private TicketRepository  ticketRepository;

    // Get all tickets
    public List<Ticket > getAllTickets() {
        return ticketRepository.findAll();
    }

    // Get ticket by ID
    public Ticket getTicketById(Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if (ticket.isPresent()) {
            return ticket.get();
        } else {
            throw new RuntimeException("Ticket not found");
        }
    }

    // Create a new ticket
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // Update an existing ticket
    public Ticket updateTicket(Long id, Ticket ticketDetails) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        ticket.setPassengerName(ticketDetails.getPassengerName());
        ticket.setTrainNumber(ticketDetails.getTrainNumber());
        ticket.setOrigin(ticketDetails.getOrigin());
        ticket.setDestination(ticketDetails.getDestination());
        ticket.setTravelDate(ticketDetails.getTravelDate());
        ticket.setFare(ticketDetails.getFare());

        return ticketRepository.save(ticket);
    }

    // Delete a ticket
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}