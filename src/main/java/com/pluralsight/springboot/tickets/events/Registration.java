package com.pluralsight.springboot.tickets.events;

public record Registration(
        Integer id,
        Integer productId,
        String ticketCode,
        String attendeeName
) {
}
