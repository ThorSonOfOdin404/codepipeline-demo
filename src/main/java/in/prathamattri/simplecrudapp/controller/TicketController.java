package in.prathamattri.simplecrudapp.controller;

import in.prathamattri.simplecrudapp.model.Ticket;
import in.prathamattri.simplecrudapp.model.TicketsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private List<Ticket> tickets = new ArrayList<>();

    @GetMapping("")
    public ResponseEntity<TicketsDto> getTickets() {
        TicketsDto ticketsDto = new TicketsDto(tickets);
        return new ResponseEntity<>(ticketsDto, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket) {
        tickets.add(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
}
