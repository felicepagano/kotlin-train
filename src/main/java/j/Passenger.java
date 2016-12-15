package j;

import k.TicketType;
import k.UtilKt;

import java.util.Objects;

@Deprecated
public class Passenger {

    private final Object ticketId;

    private final k.TicketType ticketType;

    public Passenger() {
        this(UtilKt.generateId(), TicketType.REGULAR);
    }

    public Passenger(Object ticketId, TicketType ticketType) {
        Objects.requireNonNull(ticketId);
        Objects.requireNonNull(ticketType);
        this.ticketId = ticketId;
        this.ticketType = ticketType;
    }

    public Object getTicketId() {
        return ticketId;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    @Override
    public String toString() {
        final String string;
        switch (ticketType) {
            case REGULAR:
                string = "☺";
                break;
            case REDUCED:
                string = "♿";
                break;
            case FREE:
                string = "♛";
                break;
            default:
                throw new IllegalStateException("Unsupported ticket type " + ticketType);
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (!ticketId.equals(passenger.ticketId)) return false;
        return ticketType == passenger.ticketType;

    }

    @Override
    public int hashCode() {
        int result = ticketId.hashCode();
        result = 31 * result + ticketType.hashCode();
        return result;
    }
}
