package step01;

import k.TicketType;

public final class PrintTicketTypeJava {
    public static void main(final String... args) {
        System.out.println("Ticket types:");
        for (final TicketType ticketType : TicketType.values()) {
            System.out.println(" - " + ticketType);
        }
    }
}
