package in.prathamattri.simplecrudapp.model;

import lombok.NonNull;

import java.util.List;

public record TicketsDto(@NonNull List<Ticket> tickets) {}
